/**
 */
package alin.sske.sSKEEcore.impl;

import alin.sske.sSKEEcore.BlockCipherModeOfOperation;
import alin.sske.sSKEEcore.PseudoRandomFunction;
import alin.sske.sSKEEcore.PseudoRandomGenerator;
import alin.sske.sSKEEcore.SSKEDecryptor;
import alin.sske.sSKEEcore.SSKEEcoreFactory;
import alin.sske.sSKEEcore.SSKEEcorePackage;
import alin.sske.sSKEEcore.SSKEEncryptor;
import alin.sske.sSKEEcore.SSKEKeys;
import alin.sske.sSKEEcore.SSKEKeysGenerator;
import alin.sske.sSKEEcore.SSKKeysJson;
import alin.sske.sSKEEcore.SSKKeysTxt;
import alin.sske.sSKEEcore.SymmetricDecryptor;
import alin.sske.sSKEEcore.SymmetricEncryptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SSKEEcorePackageImpl extends EPackageImpl implements SSKEEcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskeEncryptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskeDecryptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoRandomGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoRandomFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricEncryptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricDecryptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskeKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskKeysTxtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskeKeysGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sskKeysJsonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockCipherModeOfOperationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see alin.sske.sSKEEcore.SSKEEcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SSKEEcorePackageImpl() {
		super(eNS_URI, SSKEEcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SSKEEcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SSKEEcorePackage init() {
		if (isInited) return (SSKEEcorePackage)EPackage.Registry.INSTANCE.getEPackage(SSKEEcorePackage.eNS_URI);

		// Obtain or create and register package
		SSKEEcorePackageImpl theSSKEEcorePackage = (SSKEEcorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SSKEEcorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SSKEEcorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSSKEEcorePackage.createPackageContents();

		// Initialize created meta-data
		theSSKEEcorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSSKEEcorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SSKEEcorePackage.eNS_URI, theSSKEEcorePackage);
		return theSSKEEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKEEncryptor() {
		return sskeEncryptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEEncryptor_Symmetricencryptor() {
		return (EReference)sskeEncryptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEEncryptor_Pseudorandomgenerator() {
		return (EReference)sskeEncryptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEEncryptor_Pseudorandomfunction() {
		return (EReference)sskeEncryptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKEDecryptor() {
		return sskeDecryptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEDecryptor_Pseudorandomgenerator() {
		return (EReference)sskeDecryptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEDecryptor_Pseudorandomfunction() {
		return (EReference)sskeDecryptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKEDecryptor_Symmetricdecryptor() {
		return (EReference)sskeDecryptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudoRandomGenerator() {
		return pseudoRandomGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudoRandomGenerator__GenerateKey__int_String() {
		return pseudoRandomGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudoRandomFunction() {
		return pseudoRandomFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudoRandomFunction__GenerateRandomPiece__String_String() {
		return pseudoRandomFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricEncryptor() {
		return symmetricEncryptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptor__Encrypt__String_String() {
		return symmetricEncryptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricDecryptor() {
		return symmetricDecryptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricDecryptor__Decrypt__String_String() {
		return symmetricDecryptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAES() {
		return aesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAES_IV() {
		return (EAttribute)aesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAES_Mode() {
		return (EAttribute)aesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKEKeys() {
		return sskeKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSKEKeys_KeyA() {
		return (EAttribute)sskeKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSKEKeys_KeyB() {
		return (EAttribute)sskeKeysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSKEKeys_KeyC() {
		return (EAttribute)sskeKeysEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKKeysTxt() {
		return sskKeysTxtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKKeysTxt_Sskekeys() {
		return (EReference)sskKeysTxtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysTxt__SSKeysTxt__SSKEKeys() {
		return sskKeysTxtEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysTxt__SaveToFile__String() {
		return sskKeysTxtEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysTxt__LoadFromFile__String() {
		return sskKeysTxtEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKE() {
		return sskeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKE_Sskekeys() {
		return (EReference)sskeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKE_Sskedecryptor() {
		return (EReference)sskeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKE_Sskeencryptor() {
		return (EReference)sskeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKEKeysGenerator() {
		return sskeKeysGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKEKeysGenerator__GenerateKeys() {
		return sskeKeysGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSKKeysJson() {
		return sskKeysJsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSKKeysJson_Sskekeys() {
		return (EReference)sskKeysJsonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysJson__SSKeysJson__SSKEKeys() {
		return sskKeysJsonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysJson__ConvertToJson() {
		return sskKeysJsonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSKKeysJson__LoadFromJson() {
		return sskKeysJsonEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockCipherModeOfOperation() {
		return blockCipherModeOfOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEcoreFactory getSSKEEcoreFactory() {
		return (SSKEEcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sskeEncryptorEClass = createEClass(SSKE_ENCRYPTOR);
		createEReference(sskeEncryptorEClass, SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR);
		createEReference(sskeEncryptorEClass, SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR);
		createEReference(sskeEncryptorEClass, SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION);

		sskeDecryptorEClass = createEClass(SSKE_DECRYPTOR);
		createEReference(sskeDecryptorEClass, SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR);
		createEReference(sskeDecryptorEClass, SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION);
		createEReference(sskeDecryptorEClass, SSKE_DECRYPTOR__SYMMETRICDECRYPTOR);

		pseudoRandomGeneratorEClass = createEClass(PSEUDO_RANDOM_GENERATOR);
		createEOperation(pseudoRandomGeneratorEClass, PSEUDO_RANDOM_GENERATOR___GENERATE_KEY__INT_STRING);

		pseudoRandomFunctionEClass = createEClass(PSEUDO_RANDOM_FUNCTION);
		createEOperation(pseudoRandomFunctionEClass, PSEUDO_RANDOM_FUNCTION___GENERATE_RANDOM_PIECE__STRING_STRING);

		symmetricEncryptorEClass = createEClass(SYMMETRIC_ENCRYPTOR);
		createEOperation(symmetricEncryptorEClass, SYMMETRIC_ENCRYPTOR___ENCRYPT__STRING_STRING);

		symmetricDecryptorEClass = createEClass(SYMMETRIC_DECRYPTOR);
		createEOperation(symmetricDecryptorEClass, SYMMETRIC_DECRYPTOR___DECRYPT__STRING_STRING);

		aesEClass = createEClass(AES);
		createEAttribute(aesEClass, AES__IV);
		createEAttribute(aesEClass, AES__MODE);

		sskeKeysEClass = createEClass(SSKE_KEYS);
		createEAttribute(sskeKeysEClass, SSKE_KEYS__KEY_A);
		createEAttribute(sskeKeysEClass, SSKE_KEYS__KEY_B);
		createEAttribute(sskeKeysEClass, SSKE_KEYS__KEY_C);

		sskKeysTxtEClass = createEClass(SSK_KEYS_TXT);
		createEReference(sskKeysTxtEClass, SSK_KEYS_TXT__SSKEKEYS);
		createEOperation(sskKeysTxtEClass, SSK_KEYS_TXT___SS_KEYS_TXT__SSKEKEYS);
		createEOperation(sskKeysTxtEClass, SSK_KEYS_TXT___SAVE_TO_FILE__STRING);
		createEOperation(sskKeysTxtEClass, SSK_KEYS_TXT___LOAD_FROM_FILE__STRING);

		sskeEClass = createEClass(SSKE);
		createEReference(sskeEClass, SSKE__SSKEKEYS);
		createEReference(sskeEClass, SSKE__SSKEDECRYPTOR);
		createEReference(sskeEClass, SSKE__SSKEENCRYPTOR);

		sskeKeysGeneratorEClass = createEClass(SSKE_KEYS_GENERATOR);
		createEOperation(sskeKeysGeneratorEClass, SSKE_KEYS_GENERATOR___GENERATE_KEYS);

		sskKeysJsonEClass = createEClass(SSK_KEYS_JSON);
		createEReference(sskKeysJsonEClass, SSK_KEYS_JSON__SSKEKEYS);
		createEOperation(sskKeysJsonEClass, SSK_KEYS_JSON___SS_KEYS_JSON__SSKEKEYS);
		createEOperation(sskKeysJsonEClass, SSK_KEYS_JSON___CONVERT_TO_JSON);
		createEOperation(sskKeysJsonEClass, SSK_KEYS_JSON___LOAD_FROM_JSON);

		// Create enums
		blockCipherModeOfOperationEEnum = createEEnum(BLOCK_CIPHER_MODE_OF_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aesEClass.getESuperTypes().add(this.getSymmetricEncryptor());
		aesEClass.getESuperTypes().add(this.getSymmetricDecryptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(sskeEncryptorEClass, SSKEEncryptor.class, "SSKEEncryptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSKEEncryptor_Symmetricencryptor(), this.getSymmetricEncryptor(), null, "symmetricencryptor", null, 1, 1, SSKEEncryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKEEncryptor_Pseudorandomgenerator(), this.getPseudoRandomGenerator(), null, "pseudorandomgenerator", null, 1, 1, SSKEEncryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKEEncryptor_Pseudorandomfunction(), this.getPseudoRandomFunction(), null, "pseudorandomfunction", null, 1, 1, SSKEEncryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sskeDecryptorEClass, SSKEDecryptor.class, "SSKEDecryptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSKEDecryptor_Pseudorandomgenerator(), this.getPseudoRandomGenerator(), null, "pseudorandomgenerator", null, 1, 1, SSKEDecryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKEDecryptor_Pseudorandomfunction(), this.getPseudoRandomFunction(), null, "pseudorandomfunction", null, 1, 1, SSKEDecryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKEDecryptor_Symmetricdecryptor(), this.getSymmetricDecryptor(), null, "symmetricdecryptor", null, 1, 1, SSKEDecryptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pseudoRandomGeneratorEClass, PseudoRandomGenerator.class, "PseudoRandomGenerator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPseudoRandomGenerator__GenerateKey__int_String(), theXMLTypePackage.getString(), "generateKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pseudoRandomFunctionEClass, PseudoRandomFunction.class, "PseudoRandomFunction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPseudoRandomFunction__GenerateRandomPiece__String_String(), null, "generateRandomPiece", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "seed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symmetricEncryptorEClass, SymmetricEncryptor.class, "SymmetricEncryptor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymmetricEncryptor__Encrypt__String_String(), theXMLTypePackage.getString(), "encrypt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symmetricDecryptorEClass, SymmetricDecryptor.class, "SymmetricDecryptor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymmetricDecryptor__Decrypt__String_String(), null, "decrypt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "encryptedData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aesEClass, alin.sske.sSKEEcore.AES.class, "AES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAES_IV(), theXMLTypePackage.getString(), "IV", null, 0, 1, alin.sske.sSKEEcore.AES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAES_Mode(), this.getBlockCipherModeOfOperation(), "Mode", null, 0, 1, alin.sske.sSKEEcore.AES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sskeKeysEClass, SSKEKeys.class, "SSKEKeys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSSKEKeys_KeyA(), theXMLTypePackage.getString(), "keyA", null, 0, 1, SSKEKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSKEKeys_KeyB(), theXMLTypePackage.getString(), "keyB", null, 0, 1, SSKEKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSSKEKeys_KeyC(), theXMLTypePackage.getString(), "keyC", null, 0, 1, SSKEKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sskKeysTxtEClass, SSKKeysTxt.class, "SSKKeysTxt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSKKeysTxt_Sskekeys(), this.getSSKEKeys(), null, "sskekeys", null, 1, 1, SSKKeysTxt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSSKKeysTxt__SSKeysTxt__SSKEKeys(), this.getSSKEKeys(), "SSKeysTxt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSSKEKeys(), "sskekeys", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSSKKeysTxt__SaveToFile__String(), null, "saveToFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSSKKeysTxt__LoadFromFile__String(), null, "loadFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sskeEClass, alin.sske.sSKEEcore.SSKE.class, "SSKE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSKE_Sskekeys(), this.getSSKEKeys(), null, "sskekeys", null, 1, 1, alin.sske.sSKEEcore.SSKE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKE_Sskedecryptor(), this.getSSKEDecryptor(), null, "sskedecryptor", null, 1, 1, alin.sske.sSKEEcore.SSKE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSSKE_Sskeencryptor(), this.getSSKEEncryptor(), null, "sskeencryptor", null, 1, 1, alin.sske.sSKEEcore.SSKE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sskeKeysGeneratorEClass, SSKEKeysGenerator.class, "SSKEKeysGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSSKEKeysGenerator__GenerateKeys(), this.getSSKEKeys(), "generateKeys", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sskKeysJsonEClass, SSKKeysJson.class, "SSKKeysJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSKKeysJson_Sskekeys(), this.getSSKEKeys(), null, "sskekeys", null, 1, 1, SSKKeysJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSSKKeysJson__SSKeysJson__SSKEKeys(), this.getSSKEKeys(), "SSKeysJson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSSKEKeys(), "sskekeys", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSSKKeysJson__ConvertToJson(), null, "convertToJson", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSSKKeysJson__LoadFromJson(), null, "loadFromJson", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(blockCipherModeOfOperationEEnum, BlockCipherModeOfOperation.class, "BlockCipherModeOfOperation");
		addEEnumLiteral(blockCipherModeOfOperationEEnum, BlockCipherModeOfOperation.CBC);
		addEEnumLiteral(blockCipherModeOfOperationEEnum, BlockCipherModeOfOperation.CTR);

		// Create resource
		createResource(eNS_URI);
	}

} //SSKEEcorePackageImpl
