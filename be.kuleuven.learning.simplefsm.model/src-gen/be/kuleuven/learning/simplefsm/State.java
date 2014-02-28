/**
 */
package be.kuleuven.learning.simplefsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.State#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.State#getActivity <em>Activity</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.State#getOwningFSM <em>Owning FSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
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
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' attribute.
   * @see #setActivity(String)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState_Activity()
   * @model unique="false"
   * @generated
   */
  String getActivity();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.State#getActivity <em>Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' attribute.
   * @see #getActivity()
   * @generated
   */
  void setActivity(String value);

  /**
   * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.Transition}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Transitions</em>' reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState_OutgoingTransitions()
   * @see be.kuleuven.learning.simplefsm.Transition#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Transition> getOutgoingTransitions();

  /**
   * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.Transition}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming Transitions</em>' reference list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState_IncomingTransitions()
   * @see be.kuleuven.learning.simplefsm.Transition#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Transition> getIncomingTransitions();

  /**
   * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedStates <em>Owned States</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning FSM</em>' container reference.
   * @see #setOwningFSM(FiniteStateMachine)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getState_OwningFSM()
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedStates
   * @model opposite="ownedStates" transient="false"
   * @generated
   */
  FiniteStateMachine getOwningFSM();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.State#getOwningFSM <em>Owning FSM</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning FSM</em>' container reference.
   * @see #getOwningFSM()
   * @generated
   */
  void setOwningFSM(FiniteStateMachine value);

} // State
