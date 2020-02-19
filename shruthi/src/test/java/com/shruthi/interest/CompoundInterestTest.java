package com.shruthi.interest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {
	CompoundInterest compoundinterest=new CompoundInterest();
	public static final double DELTA=1e-15;
	@Test
	public void test() {
		double expectedCI=21.000000000000014;
		assertEquals(expectedCI,compoundinterest.CompoundInterestCalculation(100, 2, 10),DELTA);
	}

}
