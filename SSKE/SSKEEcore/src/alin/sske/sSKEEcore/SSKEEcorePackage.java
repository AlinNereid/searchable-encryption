/**
 */
package alin.sske.sSKEEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see alin.sske.sSKEEcore.SSKEEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface SSKEEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sSKEEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sSKEEcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sSKEEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SSKEEcorePackage eINSTANCE = alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKEEncryptorImpl <em>SSKE Encryptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKEEncryptorImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEEncryptor()
	 * @generated
	 */
	int SSKE_ENCRYPTOR = 0;

	/**
	 * The feature id for the '<em><b>Symmetricencryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR = 0;

	/**
	 * The feature id for the '<em><b>Pseudorandomgenerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Pseudorandomfunction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION = 2;

	/**
	 * The number of structural features of the '<em>SSKE Encryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_ENCRYPTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SSKE Encryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_ENCRYPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKEDecryptorImpl <em>SSKE Decryptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKEDecryptorImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEDecryptor()
	 * @generated
	 */
	int SSKE_DECRYPTOR = 1;

	/**
	 * The feature id for the '<em><b>Pseudorandomgenerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Pseudorandomfunction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Symmetricdecryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_DECRYPTOR__SYMMETRICDECRYPTOR = 2;

	/**
	 * The number of structural features of the '<em>SSKE Decryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_DECRYPTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SSKE Decryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_DECRYPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.PseudoRandomGenerator <em>Pseudo Random Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.PseudoRandomGenerator
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getPseudoRandomGenerator()
	 * @generated
	 */
	int PSEUDO_RANDOM_GENERATOR = 2;

	/**
	 * The number of structural features of the '<em>Pseudo Random Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Generate Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_GENERATOR___GENERATE_KEY__INT_STRING = 0;

	/**
	 * The number of operations of the '<em>Pseudo Random Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_GENERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.PseudoRandomFunction <em>Pseudo Random Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.PseudoRandomFunction
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getPseudoRandomFunction()
	 * @generated
	 */
	int PSEUDO_RANDOM_FUNCTION = 3;

	/**
	 * The number of structural features of the '<em>Pseudo Random Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Generate Random Piece</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_FUNCTION___GENERATE_RANDOM_PIECE__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Pseudo Random Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_RANDOM_FUNCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.SymmetricEncryptor <em>Symmetric Encryptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.SymmetricEncryptor
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSymmetricEncryptor()
	 * @generated
	 */
	int SYMMETRIC_ENCRYPTOR = 4;

	/**
	 * The number of structural features of the '<em>Symmetric Encryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Encrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTOR___ENCRYPT__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Symmetric Encryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.SymmetricDecryptor <em>Symmetric Decryptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.SymmetricDecryptor
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSymmetricDecryptor()
	 * @generated
	 */
	int SYMMETRIC_DECRYPTOR = 5;

	/**
	 * The number of structural features of the '<em>Symmetric Decryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DECRYPTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Decrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DECRYPTOR___DECRYPT__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Symmetric Decryptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DECRYPTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.AESImpl <em>AES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.AESImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getAES()
	 * @generated
	 */
	int AES = 6;

	/**
	 * The feature id for the '<em><b>IV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES__IV = SYMMETRIC_ENCRYPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES__MODE = SYMMETRIC_ENCRYPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES_FEATURE_COUNT = SYMMETRIC_ENCRYPTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Encrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES___ENCRYPT__STRING_STRING = SYMMETRIC_ENCRYPTOR___ENCRYPT__STRING_STRING;

	/**
	 * The operation id for the '<em>Decrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES___DECRYPT__STRING_STRING = SYMMETRIC_ENCRYPTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>AES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AES_OPERATION_COUNT = SYMMETRIC_ENCRYPTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKEKeysImpl <em>SSKE Keys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKEKeysImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEKeys()
	 * @generated
	 */
	int SSKE_KEYS = 7;

	/**
	 * The feature id for the '<em><b>Key A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS__KEY_A = 0;

	/**
	 * The feature id for the '<em><b>Key B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS__KEY_B = 1;

	/**
	 * The feature id for the '<em><b>Key C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS__KEY_C = 2;

	/**
	 * The number of structural features of the '<em>SSKE Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SSKE Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKKeysTxtImpl <em>SSK Keys Txt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKKeysTxtImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKKeysTxt()
	 * @generated
	 */
	int SSK_KEYS_TXT = 8;

	/**
	 * The feature id for the '<em><b>Sskekeys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT__SSKEKEYS = 0;

	/**
	 * The number of structural features of the '<em>SSK Keys Txt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>SS Keys Txt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT___SS_KEYS_TXT__SSKEKEYS = 0;

	/**
	 * The operation id for the '<em>Save To File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT___SAVE_TO_FILE__STRING = 1;

	/**
	 * The operation id for the '<em>Load From File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT___LOAD_FROM_FILE__STRING = 2;

	/**
	 * The number of operations of the '<em>SSK Keys Txt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_TXT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKEImpl <em>SSKE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKEImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKE()
	 * @generated
	 */
	int SSKE = 9;

	/**
	 * The feature id for the '<em><b>Sskekeys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE__SSKEKEYS = 0;

	/**
	 * The feature id for the '<em><b>Sskedecryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE__SSKEDECRYPTOR = 1;

	/**
	 * The feature id for the '<em><b>Sskeencryptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE__SSKEENCRYPTOR = 2;

	/**
	 * The number of structural features of the '<em>SSKE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SSKE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKEKeysGeneratorImpl <em>SSKE Keys Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKEKeysGeneratorImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEKeysGenerator()
	 * @generated
	 */
	int SSKE_KEYS_GENERATOR = 10;

	/**
	 * The number of structural features of the '<em>SSKE Keys Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Generate Keys</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS_GENERATOR___GENERATE_KEYS = 0;

	/**
	 * The number of operations of the '<em>SSKE Keys Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSKE_KEYS_GENERATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.impl.SSKKeysJsonImpl <em>SSK Keys Json</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.impl.SSKKeysJsonImpl
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKKeysJson()
	 * @generated
	 */
	int SSK_KEYS_JSON = 11;

	/**
	 * The feature id for the '<em><b>Sskekeys</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON__SSKEKEYS = 0;

	/**
	 * The number of structural features of the '<em>SSK Keys Json</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>SS Keys Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON___SS_KEYS_JSON__SSKEKEYS = 0;

	/**
	 * The operation id for the '<em>Convert To Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON___CONVERT_TO_JSON = 1;

	/**
	 * The operation id for the '<em>Load From Json</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON___LOAD_FROM_JSON = 2;

	/**
	 * The number of operations of the '<em>SSK Keys Json</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSK_KEYS_JSON_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link alin.sske.sSKEEcore.BlockCipherModeOfOperation <em>Block Cipher Mode Of Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alin.sske.sSKEEcore.BlockCipherModeOfOperation
	 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getBlockCipherModeOfOperation()
	 * @generated
	 */
	int BLOCK_CIPHER_MODE_OF_OPERATION = 12;


	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKEEncryptor <em>SSKE Encryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSKE Encryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKEEncryptor
	 * @generated
	 */
	EClass getSSKEEncryptor();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEEncryptor#getSymmetricencryptor <em>Symmetricencryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symmetricencryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKEEncryptor#getSymmetricencryptor()
	 * @see #getSSKEEncryptor()
	 * @generated
	 */
	EReference getSSKEEncryptor_Symmetricencryptor();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pseudorandomgenerator</em>'.
	 * @see alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomgenerator()
	 * @see #getSSKEEncryptor()
	 * @generated
	 */
	EReference getSSKEEncryptor_Pseudorandomgenerator();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pseudorandomfunction</em>'.
	 * @see alin.sske.sSKEEcore.SSKEEncryptor#getPseudorandomfunction()
	 * @see #getSSKEEncryptor()
	 * @generated
	 */
	EReference getSSKEEncryptor_Pseudorandomfunction();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKEDecryptor <em>SSKE Decryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSKE Decryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKEDecryptor
	 * @generated
	 */
	EClass getSSKEDecryptor();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomgenerator <em>Pseudorandomgenerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pseudorandomgenerator</em>'.
	 * @see alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomgenerator()
	 * @see #getSSKEDecryptor()
	 * @generated
	 */
	EReference getSSKEDecryptor_Pseudorandomgenerator();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomfunction <em>Pseudorandomfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pseudorandomfunction</em>'.
	 * @see alin.sske.sSKEEcore.SSKEDecryptor#getPseudorandomfunction()
	 * @see #getSSKEDecryptor()
	 * @generated
	 */
	EReference getSSKEDecryptor_Pseudorandomfunction();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKEDecryptor#getSymmetricdecryptor <em>Symmetricdecryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symmetricdecryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKEDecryptor#getSymmetricdecryptor()
	 * @see #getSSKEDecryptor()
	 * @generated
	 */
	EReference getSSKEDecryptor_Symmetricdecryptor();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.PseudoRandomGenerator <em>Pseudo Random Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Random Generator</em>'.
	 * @see alin.sske.sSKEEcore.PseudoRandomGenerator
	 * @generated
	 */
	EClass getPseudoRandomGenerator();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.PseudoRandomGenerator#generateKey(int, java.lang.String) <em>Generate Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Key</em>' operation.
	 * @see alin.sske.sSKEEcore.PseudoRandomGenerator#generateKey(int, java.lang.String)
	 * @generated
	 */
	EOperation getPseudoRandomGenerator__GenerateKey__int_String();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.PseudoRandomFunction <em>Pseudo Random Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Random Function</em>'.
	 * @see alin.sske.sSKEEcore.PseudoRandomFunction
	 * @generated
	 */
	EClass getPseudoRandomFunction();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.PseudoRandomFunction#generateRandomPiece(java.lang.String, java.lang.String) <em>Generate Random Piece</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Random Piece</em>' operation.
	 * @see alin.sske.sSKEEcore.PseudoRandomFunction#generateRandomPiece(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPseudoRandomFunction__GenerateRandomPiece__String_String();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SymmetricEncryptor <em>Symmetric Encryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Encryptor</em>'.
	 * @see alin.sske.sSKEEcore.SymmetricEncryptor
	 * @generated
	 */
	EClass getSymmetricEncryptor();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SymmetricEncryptor#encrypt(java.lang.String, java.lang.String) <em>Encrypt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encrypt</em>' operation.
	 * @see alin.sske.sSKEEcore.SymmetricEncryptor#encrypt(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSymmetricEncryptor__Encrypt__String_String();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SymmetricDecryptor <em>Symmetric Decryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Decryptor</em>'.
	 * @see alin.sske.sSKEEcore.SymmetricDecryptor
	 * @generated
	 */
	EClass getSymmetricDecryptor();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SymmetricDecryptor#decrypt(java.lang.String, java.lang.String) <em>Decrypt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decrypt</em>' operation.
	 * @see alin.sske.sSKEEcore.SymmetricDecryptor#decrypt(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSymmetricDecryptor__Decrypt__String_String();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.AES <em>AES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AES</em>'.
	 * @see alin.sske.sSKEEcore.AES
	 * @generated
	 */
	EClass getAES();

	/**
	 * Returns the meta object for the attribute '{@link alin.sske.sSKEEcore.AES#getIV <em>IV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IV</em>'.
	 * @see alin.sske.sSKEEcore.AES#getIV()
	 * @see #getAES()
	 * @generated
	 */
	EAttribute getAES_IV();

	/**
	 * Returns the meta object for the attribute '{@link alin.sske.sSKEEcore.AES#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see alin.sske.sSKEEcore.AES#getMode()
	 * @see #getAES()
	 * @generated
	 */
	EAttribute getAES_Mode();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKEKeys <em>SSKE Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSKE Keys</em>'.
	 * @see alin.sske.sSKEEcore.SSKEKeys
	 * @generated
	 */
	EClass getSSKEKeys();

	/**
	 * Returns the meta object for the attribute '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyA <em>Key A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key A</em>'.
	 * @see alin.sske.sSKEEcore.SSKEKeys#getKeyA()
	 * @see #getSSKEKeys()
	 * @generated
	 */
	EAttribute getSSKEKeys_KeyA();

	/**
	 * Returns the meta object for the attribute '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyB <em>Key B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key B</em>'.
	 * @see alin.sske.sSKEEcore.SSKEKeys#getKeyB()
	 * @see #getSSKEKeys()
	 * @generated
	 */
	EAttribute getSSKEKeys_KeyB();

	/**
	 * Returns the meta object for the attribute '{@link alin.sske.sSKEEcore.SSKEKeys#getKeyC <em>Key C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key C</em>'.
	 * @see alin.sske.sSKEEcore.SSKEKeys#getKeyC()
	 * @see #getSSKEKeys()
	 * @generated
	 */
	EAttribute getSSKEKeys_KeyC();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKKeysTxt <em>SSK Keys Txt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSK Keys Txt</em>'.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt
	 * @generated
	 */
	EClass getSSKKeysTxt();

	/**
	 * Returns the meta object for the reference '{@link alin.sske.sSKEEcore.SSKKeysTxt#getSskekeys <em>Sskekeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sskekeys</em>'.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt#getSskekeys()
	 * @see #getSSKKeysTxt()
	 * @generated
	 */
	EReference getSSKKeysTxt_Sskekeys();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysTxt#SSKeysTxt(alin.sske.sSKEEcore.SSKEKeys) <em>SS Keys Txt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SS Keys Txt</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt#SSKeysTxt(alin.sske.sSKEEcore.SSKEKeys)
	 * @generated
	 */
	EOperation getSSKKeysTxt__SSKeysTxt__SSKEKeys();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysTxt#saveToFile(java.lang.String) <em>Save To File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save To File</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt#saveToFile(java.lang.String)
	 * @generated
	 */
	EOperation getSSKKeysTxt__SaveToFile__String();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysTxt#loadFromFile(java.lang.String) <em>Load From File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load From File</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysTxt#loadFromFile(java.lang.String)
	 * @generated
	 */
	EOperation getSSKKeysTxt__LoadFromFile__String();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKE <em>SSKE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSKE</em>'.
	 * @see alin.sske.sSKEEcore.SSKE
	 * @generated
	 */
	EClass getSSKE();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKE#getSskekeys <em>Sskekeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sskekeys</em>'.
	 * @see alin.sske.sSKEEcore.SSKE#getSskekeys()
	 * @see #getSSKE()
	 * @generated
	 */
	EReference getSSKE_Sskekeys();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKE#getSskedecryptor <em>Sskedecryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sskedecryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKE#getSskedecryptor()
	 * @see #getSSKE()
	 * @generated
	 */
	EReference getSSKE_Sskedecryptor();

	/**
	 * Returns the meta object for the containment reference '{@link alin.sske.sSKEEcore.SSKE#getSskeencryptor <em>Sskeencryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sskeencryptor</em>'.
	 * @see alin.sske.sSKEEcore.SSKE#getSskeencryptor()
	 * @see #getSSKE()
	 * @generated
	 */
	EReference getSSKE_Sskeencryptor();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKEKeysGenerator <em>SSKE Keys Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSKE Keys Generator</em>'.
	 * @see alin.sske.sSKEEcore.SSKEKeysGenerator
	 * @generated
	 */
	EClass getSSKEKeysGenerator();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKEKeysGenerator#generateKeys() <em>Generate Keys</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Keys</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKEKeysGenerator#generateKeys()
	 * @generated
	 */
	EOperation getSSKEKeysGenerator__GenerateKeys();

	/**
	 * Returns the meta object for class '{@link alin.sske.sSKEEcore.SSKKeysJson <em>SSK Keys Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSK Keys Json</em>'.
	 * @see alin.sske.sSKEEcore.SSKKeysJson
	 * @generated
	 */
	EClass getSSKKeysJson();

	/**
	 * Returns the meta object for the reference '{@link alin.sske.sSKEEcore.SSKKeysJson#getSskekeys <em>Sskekeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sskekeys</em>'.
	 * @see alin.sske.sSKEEcore.SSKKeysJson#getSskekeys()
	 * @see #getSSKKeysJson()
	 * @generated
	 */
	EReference getSSKKeysJson_Sskekeys();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysJson#SSKeysJson(alin.sske.sSKEEcore.SSKEKeys) <em>SS Keys Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SS Keys Json</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysJson#SSKeysJson(alin.sske.sSKEEcore.SSKEKeys)
	 * @generated
	 */
	EOperation getSSKKeysJson__SSKeysJson__SSKEKeys();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysJson#convertToJson() <em>Convert To Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Json</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysJson#convertToJson()
	 * @generated
	 */
	EOperation getSSKKeysJson__ConvertToJson();

	/**
	 * Returns the meta object for the '{@link alin.sske.sSKEEcore.SSKKeysJson#loadFromJson() <em>Load From Json</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load From Json</em>' operation.
	 * @see alin.sske.sSKEEcore.SSKKeysJson#loadFromJson()
	 * @generated
	 */
	EOperation getSSKKeysJson__LoadFromJson();

	/**
	 * Returns the meta object for enum '{@link alin.sske.sSKEEcore.BlockCipherModeOfOperation <em>Block Cipher Mode Of Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Cipher Mode Of Operation</em>'.
	 * @see alin.sske.sSKEEcore.BlockCipherModeOfOperation
	 * @generated
	 */
	EEnum getBlockCipherModeOfOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SSKEEcoreFactory getSSKEEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKEEncryptorImpl <em>SSKE Encryptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKEEncryptorImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEEncryptor()
		 * @generated
		 */
		EClass SSKE_ENCRYPTOR = eINSTANCE.getSSKEEncryptor();

		/**
		 * The meta object literal for the '<em><b>Symmetricencryptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_ENCRYPTOR__SYMMETRICENCRYPTOR = eINSTANCE.getSSKEEncryptor_Symmetricencryptor();

		/**
		 * The meta object literal for the '<em><b>Pseudorandomgenerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_ENCRYPTOR__PSEUDORANDOMGENERATOR = eINSTANCE.getSSKEEncryptor_Pseudorandomgenerator();

		/**
		 * The meta object literal for the '<em><b>Pseudorandomfunction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_ENCRYPTOR__PSEUDORANDOMFUNCTION = eINSTANCE.getSSKEEncryptor_Pseudorandomfunction();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKEDecryptorImpl <em>SSKE Decryptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKEDecryptorImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEDecryptor()
		 * @generated
		 */
		EClass SSKE_DECRYPTOR = eINSTANCE.getSSKEDecryptor();

		/**
		 * The meta object literal for the '<em><b>Pseudorandomgenerator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_DECRYPTOR__PSEUDORANDOMGENERATOR = eINSTANCE.getSSKEDecryptor_Pseudorandomgenerator();

		/**
		 * The meta object literal for the '<em><b>Pseudorandomfunction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_DECRYPTOR__PSEUDORANDOMFUNCTION = eINSTANCE.getSSKEDecryptor_Pseudorandomfunction();

		/**
		 * The meta object literal for the '<em><b>Symmetricdecryptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE_DECRYPTOR__SYMMETRICDECRYPTOR = eINSTANCE.getSSKEDecryptor_Symmetricdecryptor();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.PseudoRandomGenerator <em>Pseudo Random Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.PseudoRandomGenerator
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getPseudoRandomGenerator()
		 * @generated
		 */
		EClass PSEUDO_RANDOM_GENERATOR = eINSTANCE.getPseudoRandomGenerator();

		/**
		 * The meta object literal for the '<em><b>Generate Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSEUDO_RANDOM_GENERATOR___GENERATE_KEY__INT_STRING = eINSTANCE.getPseudoRandomGenerator__GenerateKey__int_String();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.PseudoRandomFunction <em>Pseudo Random Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.PseudoRandomFunction
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getPseudoRandomFunction()
		 * @generated
		 */
		EClass PSEUDO_RANDOM_FUNCTION = eINSTANCE.getPseudoRandomFunction();

		/**
		 * The meta object literal for the '<em><b>Generate Random Piece</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PSEUDO_RANDOM_FUNCTION___GENERATE_RANDOM_PIECE__STRING_STRING = eINSTANCE.getPseudoRandomFunction__GenerateRandomPiece__String_String();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.SymmetricEncryptor <em>Symmetric Encryptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.SymmetricEncryptor
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSymmetricEncryptor()
		 * @generated
		 */
		EClass SYMMETRIC_ENCRYPTOR = eINSTANCE.getSymmetricEncryptor();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_ENCRYPTOR___ENCRYPT__STRING_STRING = eINSTANCE.getSymmetricEncryptor__Encrypt__String_String();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.SymmetricDecryptor <em>Symmetric Decryptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.SymmetricDecryptor
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSymmetricDecryptor()
		 * @generated
		 */
		EClass SYMMETRIC_DECRYPTOR = eINSTANCE.getSymmetricDecryptor();

		/**
		 * The meta object literal for the '<em><b>Decrypt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DECRYPTOR___DECRYPT__STRING_STRING = eINSTANCE.getSymmetricDecryptor__Decrypt__String_String();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.AESImpl <em>AES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.AESImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getAES()
		 * @generated
		 */
		EClass AES = eINSTANCE.getAES();

		/**
		 * The meta object literal for the '<em><b>IV</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AES__IV = eINSTANCE.getAES_IV();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AES__MODE = eINSTANCE.getAES_Mode();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKEKeysImpl <em>SSKE Keys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKEKeysImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEKeys()
		 * @generated
		 */
		EClass SSKE_KEYS = eINSTANCE.getSSKEKeys();

		/**
		 * The meta object literal for the '<em><b>Key A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSKE_KEYS__KEY_A = eINSTANCE.getSSKEKeys_KeyA();

		/**
		 * The meta object literal for the '<em><b>Key B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSKE_KEYS__KEY_B = eINSTANCE.getSSKEKeys_KeyB();

		/**
		 * The meta object literal for the '<em><b>Key C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSKE_KEYS__KEY_C = eINSTANCE.getSSKEKeys_KeyC();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKKeysTxtImpl <em>SSK Keys Txt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKKeysTxtImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKKeysTxt()
		 * @generated
		 */
		EClass SSK_KEYS_TXT = eINSTANCE.getSSKKeysTxt();

		/**
		 * The meta object literal for the '<em><b>Sskekeys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSK_KEYS_TXT__SSKEKEYS = eINSTANCE.getSSKKeysTxt_Sskekeys();

		/**
		 * The meta object literal for the '<em><b>SS Keys Txt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_TXT___SS_KEYS_TXT__SSKEKEYS = eINSTANCE.getSSKKeysTxt__SSKeysTxt__SSKEKeys();

		/**
		 * The meta object literal for the '<em><b>Save To File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_TXT___SAVE_TO_FILE__STRING = eINSTANCE.getSSKKeysTxt__SaveToFile__String();

		/**
		 * The meta object literal for the '<em><b>Load From File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_TXT___LOAD_FROM_FILE__STRING = eINSTANCE.getSSKKeysTxt__LoadFromFile__String();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKEImpl <em>SSKE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKEImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKE()
		 * @generated
		 */
		EClass SSKE = eINSTANCE.getSSKE();

		/**
		 * The meta object literal for the '<em><b>Sskekeys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE__SSKEKEYS = eINSTANCE.getSSKE_Sskekeys();

		/**
		 * The meta object literal for the '<em><b>Sskedecryptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE__SSKEDECRYPTOR = eINSTANCE.getSSKE_Sskedecryptor();

		/**
		 * The meta object literal for the '<em><b>Sskeencryptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSKE__SSKEENCRYPTOR = eINSTANCE.getSSKE_Sskeencryptor();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKEKeysGeneratorImpl <em>SSKE Keys Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKEKeysGeneratorImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKEKeysGenerator()
		 * @generated
		 */
		EClass SSKE_KEYS_GENERATOR = eINSTANCE.getSSKEKeysGenerator();

		/**
		 * The meta object literal for the '<em><b>Generate Keys</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSKE_KEYS_GENERATOR___GENERATE_KEYS = eINSTANCE.getSSKEKeysGenerator__GenerateKeys();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.impl.SSKKeysJsonImpl <em>SSK Keys Json</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.impl.SSKKeysJsonImpl
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getSSKKeysJson()
		 * @generated
		 */
		EClass SSK_KEYS_JSON = eINSTANCE.getSSKKeysJson();

		/**
		 * The meta object literal for the '<em><b>Sskekeys</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSK_KEYS_JSON__SSKEKEYS = eINSTANCE.getSSKKeysJson_Sskekeys();

		/**
		 * The meta object literal for the '<em><b>SS Keys Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_JSON___SS_KEYS_JSON__SSKEKEYS = eINSTANCE.getSSKKeysJson__SSKeysJson__SSKEKeys();

		/**
		 * The meta object literal for the '<em><b>Convert To Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_JSON___CONVERT_TO_JSON = eINSTANCE.getSSKKeysJson__ConvertToJson();

		/**
		 * The meta object literal for the '<em><b>Load From Json</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSK_KEYS_JSON___LOAD_FROM_JSON = eINSTANCE.getSSKKeysJson__LoadFromJson();

		/**
		 * The meta object literal for the '{@link alin.sske.sSKEEcore.BlockCipherModeOfOperation <em>Block Cipher Mode Of Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alin.sske.sSKEEcore.BlockCipherModeOfOperation
		 * @see alin.sske.sSKEEcore.impl.SSKEEcorePackageImpl#getBlockCipherModeOfOperation()
		 * @generated
		 */
		EEnum BLOCK_CIPHER_MODE_OF_OPERATION = eINSTANCE.getBlockCipherModeOfOperation();

	}

} //SSKEEcorePackage
