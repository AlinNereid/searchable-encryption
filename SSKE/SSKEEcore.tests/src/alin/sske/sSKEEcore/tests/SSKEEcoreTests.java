/**
 */
package alin.sske.sSKEEcore.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sSKEEcore</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SSKEEcoreTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SSKEEcoreTests("sSKEEcore Tests");
		suite.addTestSuite(AESTest.class);
		suite.addTestSuite(SSKKeysTxtTest.class);
		suite.addTestSuite(SSKEKeysGeneratorTest.class);
		suite.addTestSuite(SSKKeysJsonTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSKEEcoreTests(String name) {
		super(name);
	}

} //SSKEEcoreTests
