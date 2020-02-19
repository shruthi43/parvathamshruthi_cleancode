package com.shruthi.houseconstructioncost;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {

	ConstructionCost housecost=new ConstructionCost();
	private static final double DELTA=1e-15;
	@Test
	public void test() {
		String input="Standard Material";
		assertEquals(12000.0f,housecost.calculateHouseCost(input,10),DELTA);
	}
	@Test
	public void test1() {
		String input="Above Standard Material";
		assertEquals(30000.0f,housecost.calculateHouseCost(input,20),DELTA);
	}
	@Test
	public void test2() {
		String input="High Standard Material";
		assertEquals(54000.0f,housecost.calculateHouseCost(input,30),DELTA);
	}
	@Test
	public void test3() {
		String input="High Standard Material and Fully Automated";
		assertEquals(100000.0f,housecost.calculateHouseCost(input,40),DELTA);
	}

}
