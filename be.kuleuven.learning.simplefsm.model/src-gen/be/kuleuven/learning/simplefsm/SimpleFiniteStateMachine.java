/**
 */
package be.kuleuven.learning.simplefsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getSimpleFiniteStateMachine()
 * @model
 * @generated
 */
public interface SimpleFiniteStateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getSimpleFiniteStateMachine_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial State</em>' containment reference.
   * @see #setInitialState(State)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getSimpleFiniteStateMachine_InitialState()
   * @model containment="true"
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getInitialState <em>Initial State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' containment reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getSimpleFiniteStateMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // SimpleFiniteStateMachine
