/**
 */
package be.kuleuven.learning.simplefsm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.Transition#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.Transition#getOwningState <em>Owning State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.Transition#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getTransition()
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
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getTransition_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.Transition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getTransition_Target()
   * @model
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Owning State</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.model.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owning State</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owning State</em>' container reference.
   * @see #setOwningState(State)
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getTransition_OwningState()
   * @see be.kuleuven.learning.simplefsm.model.State#getOutgoingTransitions
   * @model opposite="outgoingTransitions" transient="false"
   * @generated
   */
  State getOwningState();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.Transition#getOwningState <em>Owning State</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owning State</em>' container reference.
   * @see #getOwningState()
   * @generated
   */
  void setOwningState(State value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getTransition_Event()
   * @model unique="false"
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.Transition#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // Transition
