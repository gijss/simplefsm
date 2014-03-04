/**
 */
package be.kuleuven.learning.simplefsm.model;

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
 *   <li>{@link be.kuleuven.learning.simplefsm.model.State#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.State#getAction <em>Action</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.State#getOwningFSM <em>Owning FSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getState()
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
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getState_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getState_Action()
   * @model unique="false"
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.State#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.model.Transition}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.model.Transition#getOwningState <em>Owning State</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getState_OutgoingTransitions()
   * @see be.kuleuven.learning.simplefsm.model.Transition#getOwningState
   * @model opposite="owningState" containment="true"
   * @generated
   */
  EList<Transition> getOutgoingTransitions();

  /**
   * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning FSM</em>' container reference.
   * @see #setOwningFSM(SimpleFiniteStateMachine)
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getState_OwningFSM()
   * @see be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getStates
   * @model opposite="states" transient="false"
   * @generated
   */
  SimpleFiniteStateMachine getOwningFSM();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.State#getOwningFSM <em>Owning FSM</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning FSM</em>' container reference.
   * @see #getOwningFSM()
   * @generated
   */
  void setOwningFSM(SimpleFiniteStateMachine value);

} // State
