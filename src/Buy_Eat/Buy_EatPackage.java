/**
 */
package Buy_Eat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Buy_Eat.Buy_EatFactory
 * @model kind="package"
 * @generated
 */
public interface Buy_EatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Buy_Eat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.Buy_Eat.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Buy_EatPackage eINSTANCE = Buy_Eat.impl.Buy_EatPackageImpl.init();

	/**
	 * The meta object id for the '{@link Buy_Eat.impl.Buy_EatImpl <em>Buy Eat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Buy_Eat.impl.Buy_EatImpl
	 * @see Buy_Eat.impl.Buy_EatPackageImpl#getBuy_Eat()
	 * @generated
	 */
	int BUY_EAT = 0;

	/**
	 * The feature id for the '<em><b>Buyer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_EAT__BUYER = 0;

	/**
	 * The feature id for the '<em><b>Food</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_EAT__FOOD = 1;

	/**
	 * The feature id for the '<em><b>Eater</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_EAT__EATER = 2;

	/**
	 * The number of structural features of the '<em>Buy Eat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_EAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Buy Eat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUY_EAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Buy_Eat.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Buy_Eat.impl.PersonImpl
	 * @see Buy_Eat.impl.Buy_EatPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Buy_Eat.impl.EaterImpl <em>Eater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Buy_Eat.impl.EaterImpl
	 * @see Buy_Eat.impl.Buy_EatPackageImpl#getEater()
	 * @generated
	 */
	int EATER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATER__OWNER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eaten By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATER__EATEN_BY = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Buy_Eat.impl.BuyerImpl <em>Buyer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Buy_Eat.impl.BuyerImpl
	 * @see Buy_Eat.impl.Buy_EatPackageImpl#getBuyer()
	 * @generated
	 */
	int BUYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYER__OWNED_BY = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Buyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUYER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Buy_Eat.impl.FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Buy_Eat.impl.FoodImpl
	 * @see Buy_Eat.impl.Buy_EatPackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 4;

	/**
	 * The feature id for the '<em><b>Eats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__EATS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Buy_Eat.Buy_Eat <em>Buy Eat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buy Eat</em>'.
	 * @see Buy_Eat.Buy_Eat
	 * @generated
	 */
	EClass getBuy_Eat();

	/**
	 * Returns the meta object for the containment reference list '{@link Buy_Eat.Buy_Eat#getBuyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buyer</em>'.
	 * @see Buy_Eat.Buy_Eat#getBuyer()
	 * @see #getBuy_Eat()
	 * @generated
	 */
	EReference getBuy_Eat_Buyer();

	/**
	 * Returns the meta object for the containment reference list '{@link Buy_Eat.Buy_Eat#getFood <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Food</em>'.
	 * @see Buy_Eat.Buy_Eat#getFood()
	 * @see #getBuy_Eat()
	 * @generated
	 */
	EReference getBuy_Eat_Food();

	/**
	 * Returns the meta object for the containment reference list '{@link Buy_Eat.Buy_Eat#getEater <em>Eater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eater</em>'.
	 * @see Buy_Eat.Buy_Eat#getEater()
	 * @see #getBuy_Eat()
	 * @generated
	 */
	EReference getBuy_Eat_Eater();

	/**
	 * Returns the meta object for class '{@link Buy_Eat.Eater <em>Eater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eater</em>'.
	 * @see Buy_Eat.Eater
	 * @generated
	 */
	EClass getEater();

	/**
	 * Returns the meta object for the reference '{@link Buy_Eat.Eater#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see Buy_Eat.Eater#getOwner()
	 * @see #getEater()
	 * @generated
	 */
	EReference getEater_Owner();

	/**
	 * Returns the meta object for the reference list '{@link Buy_Eat.Eater#getEatenBy <em>Eaten By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eaten By</em>'.
	 * @see Buy_Eat.Eater#getEatenBy()
	 * @see #getEater()
	 * @generated
	 */
	EReference getEater_EatenBy();

	/**
	 * Returns the meta object for class '{@link Buy_Eat.Buyer <em>Buyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buyer</em>'.
	 * @see Buy_Eat.Buyer
	 * @generated
	 */
	EClass getBuyer();

	/**
	 * Returns the meta object for the reference list '{@link Buy_Eat.Buyer#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned By</em>'.
	 * @see Buy_Eat.Buyer#getOwnedBy()
	 * @see #getBuyer()
	 * @generated
	 */
	EReference getBuyer_OwnedBy();

	/**
	 * Returns the meta object for class '{@link Buy_Eat.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Buy_Eat.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Buy_Eat.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Buy_Eat.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link Buy_Eat.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see Buy_Eat.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for the reference '{@link Buy_Eat.Food#getEats <em>Eats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eats</em>'.
	 * @see Buy_Eat.Food#getEats()
	 * @see #getFood()
	 * @generated
	 */
	EReference getFood_Eats();

	/**
	 * Returns the meta object for the attribute '{@link Buy_Eat.Food#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Buy_Eat.Food#getName()
	 * @see #getFood()
	 * @generated
	 */
	EAttribute getFood_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Buy_EatFactory getBuy_EatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Buy_Eat.impl.Buy_EatImpl <em>Buy Eat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Buy_Eat.impl.Buy_EatImpl
		 * @see Buy_Eat.impl.Buy_EatPackageImpl#getBuy_Eat()
		 * @generated
		 */
		EClass BUY_EAT = eINSTANCE.getBuy_Eat();

		/**
		 * The meta object literal for the '<em><b>Buyer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUY_EAT__BUYER = eINSTANCE.getBuy_Eat_Buyer();

		/**
		 * The meta object literal for the '<em><b>Food</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUY_EAT__FOOD = eINSTANCE.getBuy_Eat_Food();

		/**
		 * The meta object literal for the '<em><b>Eater</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUY_EAT__EATER = eINSTANCE.getBuy_Eat_Eater();

		/**
		 * The meta object literal for the '{@link Buy_Eat.impl.EaterImpl <em>Eater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Buy_Eat.impl.EaterImpl
		 * @see Buy_Eat.impl.Buy_EatPackageImpl#getEater()
		 * @generated
		 */
		EClass EATER = eINSTANCE.getEater();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATER__OWNER = eINSTANCE.getEater_Owner();

		/**
		 * The meta object literal for the '<em><b>Eaten By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATER__EATEN_BY = eINSTANCE.getEater_EatenBy();

		/**
		 * The meta object literal for the '{@link Buy_Eat.impl.BuyerImpl <em>Buyer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Buy_Eat.impl.BuyerImpl
		 * @see Buy_Eat.impl.Buy_EatPackageImpl#getBuyer()
		 * @generated
		 */
		EClass BUYER = eINSTANCE.getBuyer();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUYER__OWNED_BY = eINSTANCE.getBuyer_OwnedBy();

		/**
		 * The meta object literal for the '{@link Buy_Eat.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Buy_Eat.impl.PersonImpl
		 * @see Buy_Eat.impl.Buy_EatPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link Buy_Eat.impl.FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Buy_Eat.impl.FoodImpl
		 * @see Buy_Eat.impl.Buy_EatPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '<em><b>Eats</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOD__EATS = eINSTANCE.getFood_Eats();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOD__NAME = eINSTANCE.getFood_Name();

	}

} //Buy_EatPackage
