package com.shruthi.interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {
	SimpleInterest simpleinterest=new SimpleInterest();
	private static final double DELTA=1e-15;//for dealing with floating point calculations
	@Test
	public void test() {
		double expectedSI=20.0;
		assertEquals(expectedSI,simpleinterest.SimpleInterestCalculation(100, 2, 10),DELTA);
	}

}
