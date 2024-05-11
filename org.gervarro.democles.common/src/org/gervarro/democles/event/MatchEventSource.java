/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.event;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.common.DataFrame;

// TODO Operation (JoinOperation, RemappingOperation), PatternBody, Pattern, Indexer, MagicSet, NativeOperation
abstract public class MatchEventSource {
	private final List<MatchEventListener> listeners =
		Collections.synchronizedList(new LinkedList<MatchEventListener>());
		// new LinkedList<MatchEventListener>();

	public final List<MatchEventListener> getMatchEventListeners() {
		return listeners;
	}
	
	public synchronized final void addEventListener(MatchEventListener listener) {
		listeners.add(listener);
	}
	
	public synchronized final void removeEventListener(MatchEventListener listener) {
		listeners.remove(listener);
	}
	
	public synchronized final void clearListeners() {
		listeners.clear();
	}
	
	private final void deliverEvent(MatchEvent event) {
		for (MatchEventListener listener : listeners) {
			listener.handleEvent(event);
		}
	}
	
	protected final void sendEvent(final DataFrame data, final String eventType) {
		MatchEvent event = new MatchEvent(this, data, eventType);
		deliverEvent(event);
	}
}
