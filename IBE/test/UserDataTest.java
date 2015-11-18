package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import core.Token;
import core.UserData;

public class UserDataTest {

	@Test
	public void test() {
		UserData userData = new UserData();
		userData.addElement(new Token());
		int count = userData.count();
		
		assertEquals("The tokens are not being added to the UserData object", 1, count);
	}

}
