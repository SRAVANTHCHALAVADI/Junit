package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void test() {
		Cal c =new Cal();
		assertEquals(5,c.add(2, 3));
	}

}
