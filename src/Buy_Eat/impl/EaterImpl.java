/**
 */
package Buy_Eat.impl;

import Buy_Eat.Buy_EatPackage;
import Buy_Eat.Buyer;
import Buy_Eat.Eater;
import Buy_Eat.Food;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Buy_Eat.impl.EaterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link Buy_Eat.impl.EaterImpl#getEatenBy <em>Eaten By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EaterImpl extends PersonImpl implements Eater {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Buyer owner;

	/**
	 * The cached value of the '{@link #getEatenBy() <em>Eaten By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEatenBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Food> eatenBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Buy_EatPackage.Literals.EATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buyer getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Buyer)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Buy_EatPackage.EATER__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buyer basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Buyer newOwner) {
		Buyer oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Buy_EatPackage.EATER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Food> getEatenBy() {
		if (eatenBy == null) {
			eatenBy = new EObjectWithInverseResolvingEList<Food>(Food.class, this, Buy_EatPackage.EATER__EATEN_BY, Buy_EatPackage.FOOD__EATS);
		}
		return eatenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Buy_EatPackage.EATER__EATEN_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEatenBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Buy_EatPackage.EATER__EATEN_BY:
				return ((InternalEList<?>)getEatenBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Buy_EatPackage.EATER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case Buy_EatPackage.EATER__EATEN_BY:
				return getEatenBy();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Buy_EatPackage.EATER__OWNER:
				setOwner((Buyer)newValue);
				return;
			case Buy_EatPackage.EATER__EATEN_BY:
				getEatenBy().clear();
				getEatenBy().addAll((Collection<? extends Food>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Buy_EatPackage.EATER__OWNER:
				setOwner((Buyer)null);
				return;
			case Buy_EatPackage.EATER__EATEN_BY:
				getEatenBy().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Buy_EatPackage.EATER__OWNER:
				return owner != null;
			case Buy_EatPackage.EATER__EATEN_BY:
				return eatenBy != null && !eatenBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EaterImpl
