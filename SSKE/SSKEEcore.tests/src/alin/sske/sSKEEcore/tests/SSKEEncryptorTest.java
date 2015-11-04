/**
 */
package alin.sske.sSKEEcore.tests;

import alin.sske.sSKEEcore.SSKEEcoreFactory;
import alin.sske.sSKEEcore.SSKEEncryptor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SSKE Encryptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SSKEEncryptorTest extends TestCase {

	/**
	 * The fixture for this SSKE Encryptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEEncryptor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SSKEEncryptorTest.class);
	}

	/**
	 * Constructs a new SSKE Encryptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEncryptorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this SSKE Encryptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SSKEEncryptor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this SSKE Encryptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSKEEncryptor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SSKEEcoreFactory.eINSTANCE.createSSKEEncryptor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SSKEEncryptorTest
