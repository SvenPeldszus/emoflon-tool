package org.moflon.tgg.algorithm.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.RuntimeFactory;

import gnu.trove.TIntCollection;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;
import gnu.trove.set.hash.TIntHashSet;

/**
 * Represents a set of matches and precedence dependencies between matches.
 *
 * @author anjorin
 *
 */
public abstract class PrecedenceStructure<M> {

	protected TIntObjectHashMap<M> matches = new TIntObjectHashMap<>();

	protected HashMap<EObject, TIntArrayList> contextToMatch = new HashMap<>();
	protected HashMap<EObject, TIntArrayList> createToMatch = new HashMap<>();

	protected TIntObjectHashMap<TIntHashSet> matchToChildren = new TIntObjectHashMap<>();
	protected TIntObjectHashMap<TIntHashSet> matchToParents = new TIntObjectHashMap<>();

	protected TObjectIntHashMap<M> matchToInt = new TObjectIntHashMap<>();

	private int counter = 1;

	protected void calculateTables(final M match) {

		this.matchToInt.put(match, this.counter);

		this.matches.put(this.counter, match);

		this.counter++;

		getCreatedElements(match).forEach(elt -> addMatchToCreateTable(elt, matchToInt(match)));
		getContextElements(match).forEach(elt -> addMatchToContextTable(elt, matchToInt(match)));

		final TIntHashSet children = extendChildrenTable(match);
		final TIntHashSet parents = extendParentsTable(match);

		children.forEach(c -> {
			if (this.matchToParents.contains(c)) {
				this.matchToParents.get(c).add(matchToInt(match));
			}
			return true;
		});

		parents.forEach(p -> {
			if (this.matchToChildren.contains(p)) {
				this.matchToChildren.get(p).add(matchToInt(match));
			}
			return true;
		});
	}

	public void removeMatches(final Collection<M> toBeRemoved) {

		final int[] allTobeRevokedIDs = new int[toBeRemoved.size()];
		int i = 0;
		for (final M m : toBeRemoved) {
			allTobeRevokedIDs[i] = matchToInt(m);
			i++;
		}

		this.createToMatch.keySet().forEach(elt -> this.createToMatch.get(elt).removeAll(allTobeRevokedIDs));
		this.contextToMatch.keySet().forEach(elt -> this.contextToMatch.get(elt).removeAll(allTobeRevokedIDs));

		for (final int id : allTobeRevokedIDs) {
			this.matchToChildren.get(id).forEach(child -> this.matchToParents.get(child).remove(id));
			this.matchToParents.get(id).forEach(parent -> this.matchToChildren.get(parent).remove(id));
			this.matchToChildren.remove(id);
			this.matchToParents.remove(id);
			this.matches.remove(id);
		}
	}

	// -------

	private void addMatchToContextTable(final EObject element, final int id) {
		addMatchToTable(this.contextToMatch, element, id);
	}

	private void addMatchToCreateTable(final EObject element, final int id) {
		addMatchToTable(this.createToMatch, element, id);
	}

	private void addMatchToTable(final HashMap<EObject, TIntArrayList> table, final EObject element, final int id) {
		if (!table.containsKey(element)) {
			table.put(element, new TIntArrayList());
		}

		table.get(element).add(id);
	}

	// --------

	private TIntHashSet extendChildrenTable(final M match) {
		return extendTable(match, getCreatedElements(match), this.contextToMatch, this.matchToChildren);
	}

	private TIntHashSet extendParentsTable(final M match) {
		return extendTable(match, getContextElements(match), this.createToMatch, this.matchToParents);
	}

	private TIntHashSet extendTable(final M match, final Collection<EObject> elements, final HashMap<EObject, TIntArrayList> eltToMatches,
			final TIntObjectHashMap<TIntHashSet> matchTable) {
		final TIntHashSet table = new TIntHashSet();
		for (final EObject elt : elements) {
			table.addAll(getOrReturnEmpty(elt, eltToMatches));
			table.remove(matchToInt(match));
		}
		matchTable.put(matchToInt(match), table);
		return table;
	}

	protected TIntArrayList getOrReturnEmpty(final EObject elt, final HashMap<EObject, TIntArrayList> table) {
		if (table.containsKey(elt)) {
			return table.get(elt);
		} else {
			return new TIntArrayList();
		}
	}

	// ---------

	public TIntCollection children(final int m) {
		if (!this.matchToChildren.containsKey(m)) {
			return new TIntHashSet();
		}
		return this.matchToChildren.get(m);
	}

	public TIntCollection parents(final int m) {
		if (!this.matchToParents.containsKey(m)) {
			return new TIntHashSet();
		}
		return this.matchToParents.get(m);
	}

	// ----------

	public TIntCollection creates(final EObject o) {
		return this.createToMatch.get(o);
	}

	public Stream<M> createsAsStream(final Graph elements) {
		return elements.stream().flatMap(e -> getCreatingMatches(e).stream());
	}

	public Stream<M> createsAsStream(final EObject elt) {
		return getCreatingMatches(elt).stream();
	}

	public Collection<M> getCreatingMatches(final EObject o) {
		if (this.createToMatch.containsKey(o)) {
			return getAsCollection(creates(o));
		} else {
			return Collections.emptyList();
		}
	}

	public Collection<M> getContextMatches(final EObject o) {
		if (this.contextToMatch.containsKey(o)) {
			return getAsCollection(this.contextToMatch.get(o));
		} else {
			return Collections.emptyList();
		}
	}

	public Collection<M> getMatches() {
		return new ArrayList<>(this.matches.valueCollection());
	}

	public TIntCollection getMatchIDs() {
		return new TIntHashSet(this.matches.keySet());
	}

	public abstract Collection<EObject> getContextElements(M m);

	public abstract Collection<EObject> getCreatedElements(M m);

	// ----------

	public org.moflon.tgg.runtime.PrecedenceStructure save() {
		final org.moflon.tgg.runtime.PrecedenceStructure ps = RuntimeFactory.eINSTANCE.createPrecedenceStructure();

		final HashMap<M, org.moflon.tgg.runtime.TripleMatch> conversionTable = convertToMatches();
		ps.getTripleMatches().addAll(conversionTable.values().stream().sorted((a, b) -> a.getNumber() - b.getNumber())
				.collect(Collectors.toList()));

		getMatchIDs().forEach(m -> {
			children(m).forEach(child -> {
				if (conversionTable.containsKey(intToMatch(m))) {
					conversionTable.get(intToMatch(m)).getChildren().add(conversionTable.get(intToMatch(child)));
				}
				return true;
			});
			return true;
		});

		return ps;
	}

	private HashMap<M, org.moflon.tgg.runtime.TripleMatch> convertToMatches() {
		final HashMap<M, org.moflon.tgg.runtime.TripleMatch> conversionTable = new HashMap<>();
		getMatches().forEach(m -> conversionTable.put(m, toEMF(m)));

		return conversionTable;
	}

	protected void addEdges(final org.moflon.tgg.runtime.TripleMatch tripleMatch) {
		tripleMatch.getContextElements().forEach(elt -> {
			addIfEdge(tripleMatch, elt);
		});

		tripleMatch.getCreatedElements().forEach(elt -> {
			addIfEdge(tripleMatch, elt);
		});

		tripleMatch.getSourceElements().forEach(elt -> {
			addIfEdge(tripleMatch, elt);
		});

		tripleMatch.getTargetElements().forEach(elt -> {
			addIfEdge(tripleMatch, elt);
		});

		tripleMatch.getCorrespondenceElements().forEach(elt -> {
			addIfEdge(tripleMatch, elt);
		});
	}

	private void addIfEdge(final org.moflon.tgg.runtime.TripleMatch tripleMatch, final EObject elt) {
		if (elt instanceof EMoflonEdge) {
			tripleMatch.getContainedEdges().add((EMoflonEdge) elt);
		}
	}

	public Collection<M> createsAsCollection(final EObject elt) {
		return getAsCollection(this.createToMatch.get(elt));
	}

	protected abstract org.moflon.tgg.runtime.TripleMatch toEMF(M m);

	protected abstract M fromEMF(org.moflon.tgg.runtime.TripleMatch m);

	public M intToMatch(final int id) {
		if (!this.matches.containsKey(id)) {
			throw new RuntimeException("never seen that match id before");
		}
		return this.matches.get(id);
	}

	public int matchToInt(final M m) {
		return this.matchToInt.get(m);
	}

	public Collection<M> getAsCollection(final TIntCollection tIntCollection) {
		final ArrayList<M> result = new ArrayList<>();
		tIntCollection.forEach(i -> {
			result.add(intToMatch(i));
			return true;
		});
		return result;
	}
}
