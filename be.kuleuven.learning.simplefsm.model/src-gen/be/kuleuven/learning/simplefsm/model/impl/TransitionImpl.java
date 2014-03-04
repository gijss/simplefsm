/**
 */
package be.kuleuven.learning.simplefsm.model.impl;

import be.kuleuven.learning.simplefsm.model.ModelPackage;
import be.kuleuven.learning.simplefsm.model.State;
import be.kuleuven.learning.simplefsm.model.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl#getOwningState <em>Owning State</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.model.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
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
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected State target;

  /**
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final String EVENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected String event = EVENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return ModelPackage.Literals.TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (State)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(State newTarget)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getOwningState()
  {
    if (eContainerFeatureID() != ModelPackage.TRANSITION__OWNING_STATE) return null;
    return (State)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetOwningState()
  {
    if (eContainerFeatureID() != ModelPackage.TRANSITION__OWNING_STATE) return null;
    return (State)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningState(State newOwningState, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningState, ModelPackage.TRANSITION__OWNING_STATE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningState(State newOwningState)
  {
    if (newOwningState != eInternalContainer() || (eContainerFeatureID() != ModelPackage.TRANSITION__OWNING_STATE && newOwningState != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningState))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningState != null)
        msgs = ((InternalEObject)newOwningState).eInverseAdd(this, ModelPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
      msgs = basicSetOwningState(newOwningState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSITION__OWNING_STATE, newOwningState, newOwningState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(String newEvent)
  {
    String oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TRANSITION__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.TRANSITION__OWNING_STATE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningState((State)otherEnd, msgs);
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
      case ModelPackage.TRANSITION__OWNING_STATE:
        return basicSetOwningState(null, msgs);
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
      case ModelPackage.TRANSITION__OWNING_STATE:
        return eInternalContainer().eInverseRemove(this, ModelPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
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
      case ModelPackage.TRANSITION__NAME:
        return getName();
      case ModelPackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ModelPackage.TRANSITION__OWNING_STATE:
        if (resolve) return getOwningState();
        return basicGetOwningState();
      case ModelPackage.TRANSITION__EVENT:
        return getEvent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case ModelPackage.TRANSITION__OWNING_STATE:
        setOwningState((State)newValue);
        return;
      case ModelPackage.TRANSITION__EVENT:
        setEvent((String)newValue);
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
      case ModelPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case ModelPackage.TRANSITION__OWNING_STATE:
        setOwningState((State)null);
        return;
      case ModelPackage.TRANSITION__EVENT:
        setEvent(EVENT_EDEFAULT);
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
      case ModelPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.TRANSITION__TARGET:
        return target != null;
      case ModelPackage.TRANSITION__OWNING_STATE:
        return basicGetOwningState() != null;
      case ModelPackage.TRANSITION__EVENT:
        return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
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
    result.append(", event: ");
    result.append(event);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
