/**
 */
package Buy_Eat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Food</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Buy_Eat.Food#getEats <em>Eats</em>}</li>
 *   <li>{@link Buy_Eat.Food#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Buy_Eat.Buy_EatPackage#getFood()
 * @model
 * @generated
 */
public interface Food extends EObject {
	/**
	 * Returns the value of the '<em><b>Eats</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Buy_Eat.Eater#getEatenBy <em>Eaten By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eats</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eats</em>' reference.
	 * @see #setEats(Eater)
	 * @see Buy_Eat.Buy_EatPackage#getFood_Eats()
	 * @see Buy_Eat.Eater#getEatenBy
	 * @model opposite="eatenBy"
	 * @generated
	 */
	Eater getEats();

	/**
	 * Sets the value of the '{@link Buy_Eat.Food#getEats <em>Eats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eats</em>' reference.
	 * @see #getEats()
	 * @generated
	 */
	void setEats(Eater value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Buy_Eat.Buy_EatPackage#getFood_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Buy_Eat.Food#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Food
