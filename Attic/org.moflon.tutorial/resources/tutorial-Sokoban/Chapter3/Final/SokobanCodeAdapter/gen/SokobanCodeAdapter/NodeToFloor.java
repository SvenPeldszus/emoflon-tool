/**
 */
package SokobanCodeAdapter;

import MocaTree.File;
import MocaTree.MocaTreeFactory;
import MocaTree.Node;

import SokobanLanguage.Admin;
import SokobanLanguage.Board;
import SokobanLanguage.Floor;
import SokobanLanguage.Goal;
import SokobanLanguage.Server;
import SokobanLanguage.SokobanLanguageFactory;
import SokobanLanguage.Wall;

import TGGLanguage.csp.*;

import TGGRuntime.Edge;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.IsAppropriateRuleResult;
import TGGRuntime.Match;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.TGGRuntimeFactory;

import csp.constraints.*;

import de.upb.tools.sdm.*;

import java.util.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node To Floor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SokobanCodeAdapter.NodeToFloor#getSource <em>Source</em>}</li>
 *   <li>{@link SokobanCodeAdapter.NodeToFloor#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SokobanCodeAdapter.SokobanCodeAdapterPackage#getNodeToFloor()
 * @model
 * @generated
 */
public interface NodeToFloor extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see SokobanCodeAdapter.SokobanCodeAdapterPackage#getNodeToFloor_Source()
	 * @model
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link SokobanCodeAdapter.NodeToFloor#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Floor)
	 * @see SokobanCodeAdapter.SokobanCodeAdapterPackage#getNodeToFloor_Target()
	 * @model
	 * @generated
	 */
	Floor getTarget();

	/**
	 * Sets the value of the '{@link SokobanCodeAdapter.NodeToFloor#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Floor value);

} // NodeToFloor