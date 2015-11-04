/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Random Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getPseudoRandomGenerator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PseudoRandomGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" keyDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String generateKey(int position, String key);

} // PseudoRandomGenerator
