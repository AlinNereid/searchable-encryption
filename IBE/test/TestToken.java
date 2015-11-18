package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import core.Token;

public class TestToken {

	@Test
	public void test() {
		byte[] data = new byte[] { 1, 2 };
		
		Token token = new Token();
		token.setData(data);
		byte[] _data = token.getData();
		
		assertArrayEquals("The data got from the token is not equal to the data stored in the token object.", data, _data);
	}

}
