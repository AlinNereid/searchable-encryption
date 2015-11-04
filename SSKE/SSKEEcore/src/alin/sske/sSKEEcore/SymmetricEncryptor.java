/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Encryptor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSymmetricEncryptor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SymmetricEncryptor extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" dataDataType="org.eclipse.emf.ecore.xml.type.String" keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String encrypt(String data, String key);

} // SymmetricEncryptor
