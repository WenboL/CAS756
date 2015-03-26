/**
 */
package Buy_Eat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Buy_Eat.Eater#getOwner <em>Owner</em>}</li>
 *   <li>{@link Buy_Eat.Eater#getEatenBy <em>Eaten By</em>}</li>
 * </ul>
 * </p>
 *
 * @see Buy_Eat.Buy_EatPackage#getEater()
 * @model
 * @generated
 */
public interface Eater extends Person {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Buyer)
	 * @see Buy_Eat.Buy_EatPackage#getEater_Owner()
	 * @model
	 * @generated
	 */
	Buyer getOwner();

	/**
	 * Sets the value of the '{@link Buy_Eat.Eater#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Buyer value);

	/**
	 * Returns the value of the '<em><b>Eaten By</b></em>' reference list.
	 * The list contents are of type {@link Buy_Eat.Food}.
	 * It is bidirectional and its opposite is '{@link Buy_Eat.Food#getEats <em>Eats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eaten By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eaten By</em>' reference list.
	 * @see Buy_Eat.Buy_EatPackage#getEater_EatenBy()
	 * @see Buy_Eat.Food#getEats
	 * @model opposite="eats"
	 * @generated
	 */
	EList<Food> getEatenBy();

} // Eater
