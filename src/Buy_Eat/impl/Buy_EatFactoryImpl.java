/**
 */
package Buy_Eat.impl;

import Buy_Eat.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Buy_EatFactoryImpl extends EFactoryImpl implements Buy_EatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Buy_EatFactory init() {
		try {
			Buy_EatFactory theBuy_EatFactory = (Buy_EatFactory)EPackage.Registry.INSTANCE.getEFactory(Buy_EatPackage.eNS_URI);
			if (theBuy_EatFactory != null) {
				return theBuy_EatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Buy_EatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buy_EatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Buy_EatPackage.BUY_EAT: return createBuy_Eat();
			case Buy_EatPackage.EATER: return createEater();
			case Buy_EatPackage.BUYER: return createBuyer();
			case Buy_EatPackage.FOOD: return createFood();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buy_Eat createBuy_Eat() {
		Buy_EatImpl buy_Eat = new Buy_EatImpl();
		return buy_Eat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eater createEater() {
		EaterImpl eater = new EaterImpl();
		return eater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buyer createBuyer() {
		BuyerImpl buyer = new BuyerImpl();
		return buyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Food createFood() {
		FoodImpl food = new FoodImpl();
		return food;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buy_EatPackage getBuy_EatPackage() {
		return (Buy_EatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Buy_EatPackage getPackage() {
		return Buy_EatPackage.eINSTANCE;
	}

} //Buy_EatFactoryImpl
