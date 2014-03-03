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
   * The meta object id for the '{@link be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl <em>Simple Finite State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl
   * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getSimpleFiniteStateMachine()
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
   * The feature id for the '<em><b>Initial State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE__STATES = 2;

  /**
   * The number of structural features of the '<em>Simple Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Simple Finite State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FINITE_STATE_MACHINE_OPERATION_COUNT = 0;

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
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine <em>Simple Finite State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Finite State Machine</em>'.
   * @see be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine
   * @generated
   */
  EClass getSimpleFiniteStateMachine();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getName()
   * @see #getSimpleFiniteStateMachine()
   * @generated
   */
  EAttribute getSimpleFiniteStateMachine_Name();

  /**
   * Returns the meta object for the containment reference '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getInitialState <em>Initial State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial State</em>'.
   * @see be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getInitialState()
   * @see #getSimpleFiniteStateMachine()
   * @generated
   */
  EReference getSimpleFiniteStateMachine_InitialState();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine#getStates()
   * @see #getSimpleFiniteStateMachine()
   * @generated
   */
  EReference getSimpleFiniteStateMachine_States();

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
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.State#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getAction()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Action();

  /**
   * Returns the meta object for the containment reference list '{@link be.kuleuven.learning.simplefsm.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
   * @see be.kuleuven.learning.simplefsm.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

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
   * Returns the meta object for the container reference '{@link be.kuleuven.learning.simplefsm.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Source</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the attribute '{@link be.kuleuven.learning.simplefsm.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see be.kuleuven.learning.simplefsm.Transition#getEvent()
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
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl <em>Simple Finite State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl
     * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getSimpleFiniteStateMachine()
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
     * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE = eINSTANCE.getSimpleFiniteStateMachine_InitialState();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FINITE_STATE_MACHINE__STATES = eINSTANCE.getSimpleFiniteStateMachine_States();

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
     * The meta object literal for the '{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.kuleuven.learning.simplefsm.impl.TransitionImpl
     * @see be.kuleuven.learning.simplefsm.impl.SimplefsmPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

  }

} //SimplefsmPackage
