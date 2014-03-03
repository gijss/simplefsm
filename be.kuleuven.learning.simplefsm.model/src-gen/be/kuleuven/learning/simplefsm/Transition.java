/**
 */
package be.kuleuven.learning.simplefsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.Transition#getEvent <em>Event</em>}</li>
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
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Target()
   * @model
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
   * Returns the value of the '<em><b>Source</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' container reference.
   * @see #setSource(State)
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Source()
   * @see be.kuleuven.learning.simplefsm.State#getOutgoingTransitions
   * @model opposite="outgoingTransitions" transient="false"
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' container reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

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
   * @see be.kuleuven.learning.simplefsm.SimplefsmPackage#getTransition_Event()
   * @model unique="false"
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.Transition#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

} // Transition
