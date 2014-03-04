/**
 */
package be.kuleuven.learning.simplefsm.model;

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
 *   <li>{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getSimpleFiniteStateMachine()
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
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getSimpleFiniteStateMachine_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link be.kuleuven.learning.simplefsm.model.State}.
   * It is bidirectional and its opposite is '{@link be.kuleuven.learning.simplefsm.model.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see be.kuleuven.learning.simplefsm.model.ModelPackage#getSimpleFiniteStateMachine_States()
   * @see be.kuleuven.learning.simplefsm.model.State#getOwningFSM
   * @model opposite="owningFSM" containment="true"
   * @generated
   */
  EList<State> getStates();

} // SimpleFiniteStateMachine
