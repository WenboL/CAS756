/**
 */
package Buy_Eat.impl;

import Buy_Eat.Buy_Eat;
import Buy_Eat.Buy_EatPackage;
import Buy_Eat.Buyer;
import Buy_Eat.Eater;
import Buy_Eat.Food;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buy Eat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Buy_Eat.impl.Buy_EatImpl#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link Buy_Eat.impl.Buy_EatImpl#getFood <em>Food</em>}</li>
 *   <li>{@link Buy_Eat.impl.Buy_EatImpl#getEater <em>Eater</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Buy_EatImpl extends MinimalEObjectImpl.Container implements Buy_Eat {
	/**
	 * The cached value of the '{@link #getBuyer() <em>Buyer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuyer()
	 * @generated
	 * @ordered
	 */
	protected EList<Buyer> buyer;

	/**
	 * The cached value of the '{@link #getFood() <em>Food</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFood()
	 * @generated
	 * @ordered
	 */
	protected EList<Food> food;

	/**
	 * The cached value of the '{@link #getEater() <em>Eater</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEater()
	 * @generated
	 * @ordered
	 */
	protected EList<Eater> eater;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Buy_EatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Buy_EatPackage.Literals.BUY_EAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buyer> getBuyer() {
		if (buyer == null) {
			buyer = new EObjectContainmentEList<Buyer>(Buyer.class, this, Buy_EatPackage.BUY_EAT__BUYER);
		}
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Food> getFood() {
		if (food == null) {
			food = new EObjectContainmentEList<Food>(Food.class, this, Buy_EatPackage.BUY_EAT__FOOD);
		}
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eater> getEater() {
		if (eater == null) {
			eater = new EObjectContainmentEList<Eater>(Eater.class, this, Buy_EatPackage.BUY_EAT__EATER);
		}
		return eater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Buy_EatPackage.BUY_EAT__BUYER:
				return ((InternalEList<?>)getBuyer()).basicRemove(otherEnd, msgs);
			case Buy_EatPackage.BUY_EAT__FOOD:
				return ((InternalEList<?>)getFood()).basicRemove(otherEnd, msgs);
			case Buy_EatPackage.BUY_EAT__EATER:
				return ((InternalEList<?>)getEater()).basicRemove(otherEnd, msgs);
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
			case Buy_EatPackage.BUY_EAT__BUYER:
				return getBuyer();
			case Buy_EatPackage.BUY_EAT__FOOD:
				return getFood();
			case Buy_EatPackage.BUY_EAT__EATER:
				return getEater();
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
			case Buy_EatPackage.BUY_EAT__BUYER:
				getBuyer().clear();
				getBuyer().addAll((Collection<? extends Buyer>)newValue);
				return;
			case Buy_EatPackage.BUY_EAT__FOOD:
				getFood().clear();
				getFood().addAll((Collection<? extends Food>)newValue);
				return;
			case Buy_EatPackage.BUY_EAT__EATER:
				getEater().clear();
				getEater().addAll((Collection<? extends Eater>)newValue);
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
			case Buy_EatPackage.BUY_EAT__BUYER:
				getBuyer().clear();
				return;
			case Buy_EatPackage.BUY_EAT__FOOD:
				getFood().clear();
				return;
			case Buy_EatPackage.BUY_EAT__EATER:
				getEater().clear();
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
			case Buy_EatPackage.BUY_EAT__BUYER:
				return buyer != null && !buyer.isEmpty();
			case Buy_EatPackage.BUY_EAT__FOOD:
				return food != null && !food.isEmpty();
			case Buy_EatPackage.BUY_EAT__EATER:
				return eater != null && !eater.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Buy_EatImpl
