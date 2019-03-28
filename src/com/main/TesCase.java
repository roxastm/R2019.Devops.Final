package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesCase {

	@Test
	public void test() {
		MyClass test = new MyClass();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
