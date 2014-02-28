/**
 */
package be.kuleuven.learning.simplefsm;

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
 * @see be.kuleuven.learning.simplefsm.SimplefsmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='be.kuleuven.learning'"
 * @generated
 */
public interface SimplefsmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simplefsm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "be.kuleuven.learning.simplefsm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simplefsm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimplefsmPackage eINSTANCE = be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl.init();

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl <em>Finite State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl
   * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getFiniteStateMachine()
   * @generated
   */
  int FINITE_STATE_MACHINE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE__OWNED_STATES = 1;

  /**
   * The feature id for the '<em><b>Owned Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE__OWNED_TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Initial State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE__INITIAL_STATE = 3;

  /**
   * The feature id for the '<em><b>Final States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE__FINAL_STATES = 4;

  /**
   * The number of structural features of the '<em>Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINITE_STATE_MACHINE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.impl.StateImpl
   * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getState()
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
   * The feature id for the '<em><b>Activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ACTIVITY = 1;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INCOMING_TRANSITIONS = 3;

  /**
   * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OWNING_FSM = 4;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.impl.TransitionImpl
   * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getTransition()
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
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNING_FSM = 3;

  /**
   * The feature id for the '<em><b>Events</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENTS = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine <em>Finite State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Finite State Machine</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine
   * @generated
   */
  EClass getFiniteStateMachine();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getName()
   * @see #getFiniteStateMachine()
   * @generated
   */
  EAttribute getFiniteStateMachine_Name();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedStates <em>Owned States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned States</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedStates()
   * @see #getFiniteStateMachine()
   * @generated
   */
  EReference getFiniteStateMachine_OwnedStates();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedTransitions <em>Owned Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Transitions</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getOwnedTransitions()
   * @see #getFiniteStateMachine()
   * @generated
   */
  EReference getFiniteStateMachine_OwnedTransitions();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial State</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getInitialState()
   * @see #getFiniteStateMachine()
   * @generated
   */
  EReference getFiniteStateMachine_InitialState();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.FiniteStateMachine#getFinalStates <em>Final States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Final States</em>'.
   * @see be.kuleuven.learning.simplefsm.FiniteStateMachine#getFinalStates()
   * @see #getFiniteStateMachine()
   * @generated
   */
  EReference getFiniteStateMachine_FinalStates();

  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see be.kuleuven.learning.simplefsm.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.State#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Activity</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getActivity()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Activity();

  /**
   * Returns the meta object for the reference list '{@link be.kuleuven.learning.simplefsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

  /**
   * Returns the meta object for the reference list '{@link be.kuleuven.learning.simplefsm.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getIncomingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_IncomingTransitions();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.learning.simplefsm.State#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning FSM</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getOwningFSM()
   * @see #getState()
   * @generated
   */
  EReference getState_OwningFSM();

  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.learning.simplefsm.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the reference '{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the container reference '{@link be.kuleuven.learning.simplefsm.Transition#getOwningFSM <em>Owning FSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owning FSM</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getOwningFSM()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwningFSM();

  /**
   * Returns the meta object for the attribute list '{@link be.kuleuven.learning.simplefsm.Transition#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Events</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getEvents()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Events();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimplefsmFactory getSimplefsmFactory();

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
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl <em>Finite State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl
     * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getFiniteStateMachine()
     * @generated
     */
    EClass FINITE_STATE_MACHINE = eINSTANCE.getFiniteStateMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FINITE_STATE_MACHINE__NAME = eINSTANCE.getFiniteStateMachine_Name();

    /**
     * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINITE_STATE_MACHINE__OWNED_STATES = eINSTANCE.getFiniteStateMachine_OwnedStates();

    /**
     * The meta object literal for the '<em><b>Owned Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINITE_STATE_MACHINE__OWNED_TRANSITIONS = eINSTANCE.getFiniteStateMachine_OwnedTransitions();

    /**
     * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINITE_STATE_MACHINE__INITIAL_STATE = eINSTANCE.getFiniteStateMachine_InitialState();

    /**
     * The meta object literal for the '<em><b>Final States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINITE_STATE_MACHINE__FINAL_STATES = eINSTANCE.getFiniteStateMachine_FinalStates();

    /**
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.impl.StateImpl
     * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getState()
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
     * The meta object literal for the '<em><b>Activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__ACTIVITY = eINSTANCE.getState_Activity();

    /**
     * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

    /**
     * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

    /**
     * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

    /**
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.impl.TransitionImpl
     * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getTransition()
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
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNING_FSM = eINSTANCE.getTransition_OwningFSM();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__EVENTS = eINSTANCE.getTransition_Events();

  }

} //SimplefsmPackage
