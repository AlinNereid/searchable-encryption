/**
 */
package com.searchable_encryption.sSKEEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSKE Keys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alin.sske.sSKEEcore.SSKEKeys#getKeyA <em>Key A</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEKeys#getKeyB <em>Key B</em>}</li>
 *   <li>{@link alin.sske.sSKEEcore.SSKEKeys#getKeyC <em>Key C</em>}</li>
 * </ul>
 *
 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEKeys()
 * @model
 * @generated
 */
public interface SSKEKeys extends EObject {
	/**
	 * Returns the value of the '<em><b>Key A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key A</em>' attribute.
	 * @see #setKeyA(String)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEKeys_KeyA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getKeyA();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyA <em>Key A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key A</em>' attribute.
	 * @see #getKeyA()
	 * @generated
	 */
	void setKeyA(String value);

	/**
	 * Returns the value of the '<em><b>Key B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key B</em>' attribute.
	 * @see #setKeyB(String)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEKeys_KeyB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getKeyB();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyB <em>Key B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key B</em>' attribute.
	 * @see #getKeyB()
	 * @generated
	 */
	void setKeyB(String value);

	/**
	 * Returns the value of the '<em><b>Key C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key C</em>' attribute.
	 * @see #setKeyC(String)
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#getSSKEKeys_KeyC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getKeyC();

	/**
	 * Sets the value of the '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyC <em>Key C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key C</em>' attribute.
	 * @see #getKeyC()
	 * @generated
	 */
	void setKeyC(String value);

} // SSKEKeys
