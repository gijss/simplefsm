/**
 */
package be.kuleuven.learning.simplefsm.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.kuleuven.learning.simplefsm.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.learning.simplefsm'"
 * @generated
 */
public interface ModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "model";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.learning.simplefsm.model";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelPackage eINSTANCE = be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.model.impl.SimpleFiniteStateMachineImpl <em>Simple Finite State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.model.impl.SimpleFiniteStateMachineImpl
   * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getSimpleFiniteStateMachine()
   * @generated
   */
  int SIMPLE_FINITE_STATE_MACHINE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE__STATES = 1;

  /**
   * The number of structural features of the '<em>Simple Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Simple Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.model.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.model.impl.StateImpl
   * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTION = 1;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OWNING_FSM = 3;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.model.impl.TransitionImpl
   * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 1;

  /**
   * The feature id for the '<em><b>Owning State</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNING_STATE = 2;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine <em>Simple Finite State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Finite State Machine</em>'.
   * @see be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine
   * @generated
   */
  EClass getSimpleFiniteStateMachine();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getName()
   * @see #getSimpleFiniteStateMachine()
   * @generated
   */
  EAttribute getSimpleFiniteStateMachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see be.kuleuven.learning.simplefsm.model.SimpleFiniteStateMachine#getStates()
   * @see #getSimpleFiniteStateMachine()
   * @generated
   */
  EReference getSimpleFiniteStateMachine_States();

  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.model.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see be.kuleuven.learning.simplefsm.model.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.model.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.model.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.model.State#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see be.kuleuven.learning.simplefsm.model.State#getAction()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Action();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.model.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
   * @see be.kuleuven.learning.simplefsm.model.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.learning.simplefsm.model.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning FSM</em>'.
   * @see be.kuleuven.learning.simplefsm.model.State#getOwningFSM()
   * @see #getState()
   * @generated
   */
  EReference getState_OwningFSM();

  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.model.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see be.kuleuven.learning.simplefsm.model.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.model.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.model.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.learning.simplefsm.model.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see be.kuleuven.learning.simplefsm.model.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.learning.simplefsm.model.Transition#getOwningState <em>Owning State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning State</em>'.
   * @see be.kuleuven.learning.simplefsm.model.Transition#getOwningState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwningState();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.model.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see be.kuleuven.learning.simplefsm.model.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Event();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelFactory getModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.model.impl.SimpleFiniteStateMachineImpl <em>Simple Finite State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.model.impl.SimpleFiniteStateMachineImpl
     * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getSimpleFiniteStateMachine()
     * @generated
     */
    EClass SIMPLE_FINITE_STATE_MACHINE = eINSTANCE.getSimpleFiniteStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_FINITE_STATE_MACHINE__NAME = eINSTANCE.getSimpleFiniteStateMachine_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FINITE_STATE_MACHINE__STATES = eINSTANCE.getSimpleFiniteStateMachine_States();

    /**
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.model.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.model.impl.StateImpl
     * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ACTION = eINSTANCE.getState_Action();

    /**
     * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

    /**
     * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

    /**
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.model.impl.TransitionImpl
     * @see be.kuleuven.learning.simplefsm.model.impl.ModelPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Owning State</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNING_STATE = eINSTANCE.getTransition_OwningState();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

  }

} //ModelPackage
