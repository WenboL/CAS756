/**
 */
package Buy_Eat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buyer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Buy_Eat.Buyer#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 * </p>
 *
 * @see Buy_Eat.Buy_EatPackage#getBuyer()
 * @model
 * @generated
 */
public interface Buyer extends Person {
	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' reference list.
	 * The list contents are of type {@link Buy_Eat.Eater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' reference list.
	 * @see Buy_Eat.Buy_EatPackage#getBuyer_OwnedBy()
	 * @model
	 * @generated
	 */
	EList<Eater> getOwnedBy();

} // Buyer
