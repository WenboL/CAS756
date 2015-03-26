/**
 */
package Buy_Eat.impl;

import Buy_Eat.Buy_EatPackage;
import Buy_Eat.Buyer;
import Buy_Eat.Eater;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buyer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Buy_Eat.impl.BuyerImpl#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuyerImpl extends PersonImpl implements Buyer {
	/**
	 * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Eater> ownedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuyerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Buy_EatPackage.Literals.BUYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Eater> getOwnedBy() {
		if (ownedBy == null) {
			ownedBy = new EObjectResolvingEList<Eater>(Eater.class, this, Buy_EatPackage.BUYER__OWNED_BY);
		}
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Buy_EatPackage.BUYER__OWNED_BY:
				return getOwnedBy();
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
			case Buy_EatPackage.BUYER__OWNED_BY:
				getOwnedBy().clear();
				getOwnedBy().addAll((Collection<? extends Eater>)newValue);
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
			case Buy_EatPackage.BUYER__OWNED_BY:
				getOwnedBy().clear();
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
			case Buy_EatPackage.BUYER__OWNED_BY:
				return ownedBy != null && !ownedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuyerImpl
