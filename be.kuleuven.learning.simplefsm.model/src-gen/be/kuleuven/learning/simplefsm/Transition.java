/**
 */
package be.kuleuven.learning.simplefsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
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
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Target()
   * @see be.kuleuven.learning.simplefsm.State#getIncomingTransitions
   * @model opposite="incomingTransitions"
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(State)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Source()
   * @see be.kuleuven.learning.simplefsm.State#getOutgoingTransitions
   * @model opposite="outgoingTransitions"
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

  /**
   * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedTransitions <em>Owned Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning FSM</em>' container reference.
   * @see #setOwningFSM(FiniteStateMachine)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_OwningFSM()
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedTransitions
   * @model opposite="ownedTransitions" transient="false"
   * @generated
   */
  FiniteStateMachine getOwningFSM();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getOwningFSM <em>Owning FSM</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning FSM</em>' container reference.
   * @see #getOwningFSM()
   * @generated
   */
  void setOwningFSM(FiniteStateMachine value);

  /**
   * Returns the value of the '<em><b>Events</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' attribute list.
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Events()
   * @model unique="false"
   * @generated
   */
  EList<String> getEvents();

} // Transition
