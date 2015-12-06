/**
 */
package com.searchable_encryption.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Decryptor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSymmetricDecryptor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SymmetricDecryptor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model encryptedDataDataType="org.eclipse.emf.ecore.xml.type.String" keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String decrypt(String encryptedData, String key) throws Exception;

} // SymmetricDecryptor
