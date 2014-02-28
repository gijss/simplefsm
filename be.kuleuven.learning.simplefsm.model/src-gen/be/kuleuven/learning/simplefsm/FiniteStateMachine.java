/**
 */
package be.kuleuven.learning.simplefsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getFinalStates <em>Final States</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine()
 * @model
 * @generated
 */
public interface FiniteStateMachine extends EObject
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
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.State}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned States</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine_OwnedStates()
   * @see be.kuleuven.learning.simplefsm.State#getOwningFSM
   * @model opposite="owningFSM" containment="true"
   * @generated
   */
  EList<State> getOwnedStates();

  /**
   * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.Transition}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.Transition#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Transitions</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine_OwnedTransitions()
   * @see be.kuleuven.learning.simplefsm.Transition#getOwningFSM
   * @model opposite="owningFSM" containment="true"
   * @generated
   */
  EList<Transition> getOwnedTransitions();

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
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine_InitialState()
   * @model containment="true"
   * @generated
   */
  State getInitialState();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getInitialState <em>Initial State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial State</em>' containment reference.
   * @see #getInitialState()
   * @generated
   */
  void setInitialState(State value);

  /**
   * Returns the value of the '<em><b>Final States</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final States</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getFiniteStateMachine_FinalStates()
   * @model containment="true" required="true"
   * @generated
   */
  EList<State> getFinalStates();

} // FiniteStateMachine
