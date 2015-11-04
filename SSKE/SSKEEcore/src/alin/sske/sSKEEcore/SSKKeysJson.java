/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSK Keys Json</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.SSKKeysJson#getSskekeys <em>Sskekeys</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKKeysJson()
 * @model
 * @generated
 */
public interface SSKKeysJson extends EObject {
	/**
	 * Returns the value of the '<em><b>Sskekeys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sskekeys</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sskekeys</em>' reference.
	 * @see #setSskekeys(SSKEKeys)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKKeysJson_Sskekeys()
	 * @model required="true"
	 * @generated
	 */
	SSKEKeys getSskekeys();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKKeysJson#getSskekeys <em>Sskekeys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sskekeys</em>' reference.
	 * @see #getSskekeys()
	 * @generated
	 */
	void setSskekeys(SSKEKeys value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SSKEKeys SSKeysJson(SSKEKeys sskekeys);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void convertToJson();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loadFromJson();

} // SSKKeysJson
