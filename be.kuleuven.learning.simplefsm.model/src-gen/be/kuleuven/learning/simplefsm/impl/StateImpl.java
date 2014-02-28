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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.StateImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.StateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.StateImpl#getOwningFSM <em>Owning FSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
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
   * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivity()
   * @generated
   * @ordered
   */
  protected static final String ACTIVITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivity()
   * @generated
   * @ordered
   */
  protected String activity = ACTIVITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> outgoingTransitions;

  /**
   * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> incomingTransitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return SimplefsmPackage.Literals.STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActivity()
  {
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivity(String newActivity)
  {
    String oldActivity = activity;
    activity = newActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.STATE__ACTIVITY, oldActivity, activity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOutgoingTransitions()
  {
    if (outgoingTransitions == null)
    {
      outgoingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, SimplefsmPackage.STATE__OUTGOING_TRANSITIONS, SimplefsmPackage.TRANSITION__SOURCE);
    }
    return outgoingTransitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getIncomingTransitions()
  {
    if (incomingTransitions == null)
    {
      incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, SimplefsmPackage.STATE__INCOMING_TRANSITIONS, SimplefsmPackage.TRANSITION__TARGET);
    }
    return incomingTransitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiniteStateMachine getOwningFSM()
  {
    if (eContainerFeatureID() != SimplefsmPackage.STATE__OWNING_FSM) return null;
    return (FiniteStateMachine)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiniteStateMachine basicGetOwningFSM()
  {
    if (eContainerFeatureID() != SimplefsmPackage.STATE__OWNING_FSM) return null;
    return (FiniteStateMachine)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningFSM(FiniteStateMachine newOwningFSM, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningFSM, SimplefsmPackage.STATE__OWNING_FSM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningFSM(FiniteStateMachine newOwningFSM)
  {
    if (newOwningFSM != eInternalContainer() || (eContainerFeatureID() != SimplefsmPackage.STATE__OWNING_FSM && newOwningFSM != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningFSM))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningFSM != null)
        msgs = ((InternalEObject)newOwningFSM).eInverseAdd(this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES, FiniteStateMachine.class, msgs);
      msgs = basicSetOwningFSM(newOwningFSM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.STATE__OWNING_FSM, newOwningFSM, newOwningFSM));
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
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
      case SimplefsmPackage.STATE__OWNING_FSM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningFSM((FiniteStateMachine)otherEnd, msgs);
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
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
      case SimplefsmPackage.STATE__OWNING_FSM:
        return basicSetOwningFSM(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case SimplefsmPackage.STATE__OWNING_FSM:
        return eInternalContainer().eInverseRemove(this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_STATES, FiniteStateMachine.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case SimplefsmPackage.STATE__NAME:
        return getName();
      case SimplefsmPackage.STATE__ACTIVITY:
        return getActivity();
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        return getOutgoingTransitions();
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        return getIncomingTransitions();
      case SimplefsmPackage.STATE__OWNING_FSM:
        if (resolve) return getOwningFSM();
        return basicGetOwningFSM();
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
      case SimplefsmPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case SimplefsmPackage.STATE__ACTIVITY:
        setActivity((String)newValue);
        return;
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        getIncomingTransitions().clear();
        getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case SimplefsmPackage.STATE__OWNING_FSM:
        setOwningFSM((FiniteStateMachine)newValue);
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
      case SimplefsmPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplefsmPackage.STATE__ACTIVITY:
        setActivity(ACTIVITY_EDEFAULT);
        return;
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        return;
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        getIncomingTransitions().clear();
        return;
      case SimplefsmPackage.STATE__OWNING_FSM:
        setOwningFSM((FiniteStateMachine)null);
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
      case SimplefsmPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplefsmPackage.STATE__ACTIVITY:
        return ACTIVITY_EDEFAULT == null ? activity != null : !ACTIVITY_EDEFAULT.equals(activity);
      case SimplefsmPackage.STATE__OUTGOING_TRANSITIONS:
        return outgoingTransitions != null && !outgoingTransitions.isEmpty();
      case SimplefsmPackage.STATE__INCOMING_TRANSITIONS:
        return incomingTransitions != null && !incomingTransitions.isEmpty();
      case SimplefsmPackage.STATE__OWNING_FSM:
        return basicGetOwningFSM() != null;
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
    result.append(", activity: ");
    result.append(activity);
    result.append(')');
    return result.toString();
  }

} //StateImpl
