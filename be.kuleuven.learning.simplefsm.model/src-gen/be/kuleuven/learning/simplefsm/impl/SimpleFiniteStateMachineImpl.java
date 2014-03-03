/**
 */
package be.kuleuven.learning.simplefsm.impl;

import be.kuleuven.learning.simplefsm.SimpleFiniteStateMachine;
import be.kuleuven.learning.simplefsm.SimplefsmPackage;
import be.kuleuven.learning.simplefsm.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.SimpleFiniteStateMachineImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleFiniteStateMachineImpl extends MinimalEObjectImpl.Container implements SimpleFiniteStateMachine
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
   * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialState()
   * @generated
   * @ordered
   */
  protected State initialState;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleFiniteStateMachineImpl()
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
    return SimplefsmPackage.Literals.SIMPLE_FINITE_STATE_MACHINE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE, oldInitialState, newInitialState);
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
        msgs = ((InternalEObject)initialState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE, null, msgs);
      if (newInitialState != null)
        msgs = ((InternalEObject)newInitialState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE, null, msgs);
      msgs = basicSetInitialState(newInitialState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE, newInitialState, newInitialState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES);
    }
    return states;
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
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE:
        return basicSetInitialState(null, msgs);
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__NAME:
        return getName();
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE:
        return getInitialState();
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES:
        return getStates();
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
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__NAME:
        setName((String)newValue);
        return;
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)newValue);
        return;
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE:
        setInitialState((State)null);
        return;
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES:
        getStates().clear();
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
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__INITIAL_STATE:
        return initialState != null;
      case SimplefsmPackage.SIMPLE_FINITE_STATE_MACHINE__STATES:
        return states != null && !states.isEmpty();
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

} //SimpleFiniteStateMachineImpl
