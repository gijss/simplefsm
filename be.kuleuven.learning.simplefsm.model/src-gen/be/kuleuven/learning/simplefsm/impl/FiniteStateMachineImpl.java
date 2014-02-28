/**
 */
package be.kuleuven.learning.simplefsm.impl;

import be.kuleuven.learning.simplefsm.FiniteStateMachine;
import be.kuleuven.learning.simplefsm.SimplefsmPackage;
import be.kuleuven.learning.simplefsm.State;
import be.kuleuven.learning.simplefsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.FiniteStateMachineImpl#getFinalStates <em>Final States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FiniteStateMachineImpl extends MinimalEObjectImpl.Container implements FiniteStateMachine
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedStates()
   * @generated
   * @ordered
   */
  protected EList<State> ownedStates;

  /**
   * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> ownedTransitions;

  /**
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected State initialState;

  /**
   * The cached value of the '{@link #getFinalStates() <em>Final States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalStates()
   * @generated
   * @ordered
   */
  protected EList<State> finalStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FiniteStateMachineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimplefsmPackage.Literals.FINITE_STATE_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.FINITE_STATE_MACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getOwnedStates()
  {
    if (ownedStates == null)
    {
      ownedStates = new EObjectContainmentWithInverseEList<State>(State.class, this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES, SimplefsmPackage.STATE__OWNING_FSM);
    }
    return ownedStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOwnedTransitions()
  {
    if (ownedTransitions == null)
    {
      ownedTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS, SimplefsmPackage.TRANSITION__OWNING_FSM);
    }
    return ownedTransitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitialState()
  {
    return initialState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialState(State newInitialState, NotificationChain msgs)
  {
    State oldInitialState = initialState;
    initialState = newInitialState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE, oldInitialState, newInitialState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialState(State newInitialState)
  {
    if (newInitialState != initialState)
    {
      NotificationChain msgs = null;
      if (initialState != null)
        msgs = ((InternalEObject)initialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE, null, msgs);
      if (newInitialState != null)
        msgs = ((InternalEObject)newInitialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE, null, msgs);
      msgs = basicSetInitialState(newInitialState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE, newInitialState, newInitialState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getFinalStates()
  {
    if (finalStates == null)
    {
      finalStates = new EObjectContainmentEList<State>(State.class, this, SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES);
    }
    return finalStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedStates()).basicAdd(otherEnd, msgs);
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTransitions()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
      case SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE:
        return basicSetInitialState(null, msgs);
      case SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES:
        return ((InternalEList<?>)getFinalStates()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__NAME:
        return getName();
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        return getOwnedStates();
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        return getOwnedTransitions();
      case SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE:
        return getInitialState();
      case SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES:
        return getFinalStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__NAME:
        setName((String)newValue);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        getOwnedStates().clear();
        getOwnedStates().addAll((Collection<? extends State>)newValue);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        getOwnedTransitions().clear();
        getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)newValue);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES:
        getFinalStates().clear();
        getFinalStates().addAll((Collection<? extends State>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        getOwnedStates().clear();
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        getOwnedTransitions().clear();
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)null);
        return;
      case SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES:
        getFinalStates().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimplefsmPackage.FINITE_STATE_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES:
        return ownedStates != null && !ownedStates.isEmpty();
      case SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS:
        return ownedTransitions != null && !ownedTransitions.isEmpty();
      case SimplefsmPackage.FINITE_STATE_MACHINE__INITIAL_STATE:
        return initialState != null;
      case SimplefsmPackage.FINITE_STATE_MACHINE__FINAL_STATES:
        return finalStates != null && !finalStates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FiniteStateMachineImpl
