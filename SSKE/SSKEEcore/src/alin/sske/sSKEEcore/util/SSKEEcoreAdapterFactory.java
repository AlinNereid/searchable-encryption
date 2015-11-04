/**
 */
package alin.sske.sSKEEcore.util;

import alin.sske.sSKEEcore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see alin.sske.sSKEEcore.SSKEEcorePackage
 * @generated
 */
public class SSKEEcoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SSKEEcorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEcoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SSKEEcorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEEcoreSwitch<Adapter> modelSwitch =
		new SSKEEcoreSwitch<Adapter>() {
			@Override
			public Adapter caseSSKEEncryptor(SSKEEncryptor object) {
				return createSSKEEncryptorAdapter();
			}
			@Override
			public Adapter caseSSKEDecryptor(SSKEDecryptor object) {
				return createSSKEDecryptorAdapter();
			}
			@Override
			public Adapter casePseudoRandomGenerator(PseudoRandomGenerator object) {
				return createPseudoRandomGeneratorAdapter();
			}
			@Override
			public Adapter casePseudoRandomFunction(PseudoRandomFunction object) {
				return createPseudoRandomFunctionAdapter();
			}
			@Override
			public Adapter caseSymmetricEncryptor(SymmetricEncryptor object) {
				return createSymmetricEncryptorAdapter();
			}
			@Override
			public Adapter caseSymmetricDecryptor(SymmetricDecryptor object) {
				return createSymmetricDecryptorAdapter();
			}
			@Override
			public Adapter caseAES(AES object) {
				return createAESAdapter();
			}
			@Override
			public Adapter caseSSKEKeys(SSKEKeys object) {
				return createSSKEKeysAdapter();
			}
			@Override
			public Adapter caseSSKKeysTxt(SSKKeysTxt object) {
				return createSSKKeysTxtAdapter();
			}
			@Override
			public Adapter caseSSKE(SSKE object) {
				return createSSKEAdapter();
			}
			@Override
			public Adapter caseSSKEKeysGenerator(SSKEKeysGenerator object) {
				return createSSKEKeysGeneratorAdapter();
			}
			@Override
			public Adapter caseSSKKeysJson(SSKKeysJson object) {
				return createSSKKeysJsonAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKEEncryptor <em>SSKE Encryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKEEncryptor
	 * @generated
	 */
	public Adapter createSSKEEncryptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKEDecryptor <em>SSKE Decryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKEDecryptor
	 * @generated
	 */
	public Adapter createSSKEDecryptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.PseudoRandomGenerator <em>Pseudo Random Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.PseudoRandomGenerator
	 * @generated
	 */
	public Adapter createPseudoRandomGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.PseudoRandomFunction <em>Pseudo Random Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.PseudoRandomFunction
	 * @generated
	 */
	public Adapter createPseudoRandomFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SymmetricEncryptor <em>Symmetric Encryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SymmetricEncryptor
	 * @generated
	 */
	public Adapter createSymmetricEncryptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SymmetricDecryptor <em>Symmetric Decryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SymmetricDecryptor
	 * @generated
	 */
	public Adapter createSymmetricDecryptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.AES <em>AES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.AES
	 * @generated
	 */
	public Adapter createAESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKEKeys <em>SSKE Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKEKeys
	 * @generated
	 */
	public Adapter createSSKEKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKKeysTxt <em>SSK Keys Txt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt
	 * @generated
	 */
	public Adapter createSSKKeysTxtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKE <em>SSKE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKE
	 * @generated
	 */
	public Adapter createSSKEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKEKeysGenerator <em>SSKE Keys Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKEKeysGenerator
	 * @generated
	 */
	public Adapter createSSKEKeysGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link alin.sske.sSKEEcore.SSKKeysJson <em>SSK Keys Json</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see alin.sske.sSKEEcore.SSKKeysJson
	 * @generated
	 */
	public Adapter createSSKKeysJsonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SSKEEcoreAdapterFactory
