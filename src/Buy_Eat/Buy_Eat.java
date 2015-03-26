/**
 */
package Buy_Eat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buy Eat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Buy_Eat.Buy_Eat#getBuyer <em>Buyer</em>}</li>
 *   <li>{@link Buy_Eat.Buy_Eat#getFood <em>Food</em>}</li>
 *   <li>{@link Buy_Eat.Buy_Eat#getEater <em>Eater</em>}</li>
 * </ul>
 * </p>
 *
 * @see Buy_Eat.Buy_EatPackage#getBuy_Eat()
 * @model
 * @generated
 */
public interface Buy_Eat extends EObject {
	/**
	 * Returns the value of the '<em><b>Buyer</b></em>' containment reference list.
	 * The list contents are of type {@link Buy_Eat.Buyer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buyer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buyer</em>' containment reference list.
	 * @see Buy_Eat.Buy_EatPackage#getBuy_Eat_Buyer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buyer> getBuyer();

	/**
	 * Returns the value of the '<em><b>Food</b></em>' containment reference list.
	 * The list contents are of type {@link Buy_Eat.Food}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Food</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Food</em>' containment reference list.
	 * @see Buy_Eat.Buy_EatPackage#getBuy_Eat_Food()
	 * @model containment="true"
	 * @generated
	 */
	EList<Food> getFood();

	/**
	 * Returns the value of the '<em><b>Eater</b></em>' containment reference list.
	 * The list contents are of type {@link Buy_Eat.Eater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eater</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eater</em>' containment reference list.
	 * @see Buy_Eat.Buy_EatPackage#getBuy_Eat_Eater()
	 * @model containment="true"
	 * @generated
	 */
	EList<Eater> getEater();

} // Buy_Eat
