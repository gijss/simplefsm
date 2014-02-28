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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link be.kuleuven.learning.simplefsm.impl.TransitionImpl#getEvents <em>Events</em>}</li>
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected State source;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<String> events;

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
    return SimplefsmPackage.Literals.TRANSITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplefsmPackage.TRANSITION__TARGET, oldTarget, target));
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
  public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(State newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, SimplefsmPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, SimplefsmPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (State)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplefsmPackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(State newSource, NotificationChain msgs)
  {
    State oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(State newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, SimplefsmPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, SimplefsmPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiniteStateMachine getOwningFSM()
  {
    if (eContainerFeatureID() != SimplefsmPackage.TRANSITION__OWNING_FSM) return null;
    return (FiniteStateMachine)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FiniteStateMachine basicGetOwningFSM()
  {
    if (eContainerFeatureID() != SimplefsmPackage.TRANSITION__OWNING_FSM) return null;
    return (FiniteStateMachine)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningFSM(FiniteStateMachine newOwningFSM, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningFSM, SimplefsmPackage.TRANSITION__OWNING_FSM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningFSM(FiniteStateMachine newOwningFSM)
  {
    if (newOwningFSM != eInternalContainer() || (eContainerFeatureID() != SimplefsmPackage.TRANSITION__OWNING_FSM && newOwningFSM != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningFSM))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningFSM != null)
        msgs = ((InternalEObject)newOwningFSM).eInverseAdd(this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS, FiniteStateMachine.class, msgs);
      msgs = basicSetOwningFSM(newOwningFSM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplefsmPackage.TRANSITION__OWNING_FSM, newOwningFSM, newOwningFSM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEvents()
  {
    if (events == null)
    {
      events = new EDataTypeEList<String>(String.class, this, SimplefsmPackage.TRANSITION__EVENTS);
    }
    return events;
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
      case SimplefsmPackage.TRANSITION__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, SimplefsmPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
        return basicSetTarget((State)otherEnd, msgs);
      case SimplefsmPackage.TRANSITION__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, SimplefsmPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
        return basicSetSource((State)otherEnd, msgs);
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
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
      case SimplefsmPackage.TRANSITION__TARGET:
        return basicSetTarget(null, msgs);
      case SimplefsmPackage.TRANSITION__SOURCE:
        return basicSetSource(null, msgs);
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
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
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
        return eInternalContainer().eInverseRemove(this, SimplefsmPackage.FINITE_STATE_MACHINE__OWNED_TRANSITIONS, FiniteStateMachine.class, msgs);
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
      case SimplefsmPackage.TRANSITION__NAME:
        return getName();
      case SimplefsmPackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case SimplefsmPackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
        if (resolve) return getOwningFSM();
        return basicGetOwningFSM();
      case SimplefsmPackage.TRANSITION__EVENTS:
        return getEvents();
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
      case SimplefsmPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case SimplefsmPackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case SimplefsmPackage.TRANSITION__SOURCE:
        setSource((State)newValue);
        return;
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
        setOwningFSM((FiniteStateMachine)newValue);
        return;
      case SimplefsmPackage.TRANSITION__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends String>)newValue);
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
      case SimplefsmPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplefsmPackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case SimplefsmPackage.TRANSITION__SOURCE:
        setSource((State)null);
        return;
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
        setOwningFSM((FiniteStateMachine)null);
        return;
      case SimplefsmPackage.TRANSITION__EVENTS:
        getEvents().clear();
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
      case SimplefsmPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplefsmPackage.TRANSITION__TARGET:
        return target != null;
      case SimplefsmPackage.TRANSITION__SOURCE:
        return source != null;
      case SimplefsmPackage.TRANSITION__OWNING_FSM:
        return basicGetOwningFSM() != null;
      case SimplefsmPackage.TRANSITION__EVENTS:
        return events != null && !events.isEmpty();
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
    result.append(", events: ");
    result.append(events);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
