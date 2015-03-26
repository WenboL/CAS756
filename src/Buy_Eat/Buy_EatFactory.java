/**
 */
package Buy_Eat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Buy_Eat.Buy_EatPackage
 * @generated
 */
public interface Buy_EatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Buy_EatFactory eINSTANCE = Buy_Eat.impl.Buy_EatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Buy Eat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buy Eat</em>'.
	 * @generated
	 */
	Buy_Eat createBuy_Eat();

	/**
	 * Returns a new object of class '<em>Eater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eater</em>'.
	 * @generated
	 */
	Eater createEater();

	/**
	 * Returns a new object of class '<em>Buyer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buyer</em>'.
	 * @generated
	 */
	Buyer createBuyer();

	/**
	 * Returns a new object of class '<em>Food</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Food</em>'.
	 * @generated
	 */
	Food createFood();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Buy_EatPackage getBuy_EatPackage();

} //Buy_EatFactory
