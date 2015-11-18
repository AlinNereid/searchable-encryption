/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Random Function</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getPseudoRandomFunction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PseudoRandomFunction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String" seedDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String generateRandomPiece(String key, String seed);

} // PseudoRandomFunction
