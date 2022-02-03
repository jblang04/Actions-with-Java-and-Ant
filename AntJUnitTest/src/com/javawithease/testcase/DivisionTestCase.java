package com.javawithease.testcase;

import com.javawithease.business.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This is test case class for division method.
 * @author javawithease
 */
public class DivisionTestCase {
	//DivisionTest class objects
	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 
	DivisionTest divisionTest3 = new DivisionTest(6, 2); 
	
	//Test case for division
	@Test
	public void testOk1() {
		assertEquals(5, divisionTest1.division());
	}
	
	//Test case for expected ArithmeticException, 
	//As in this case ArithmeticException
	// is the expected exception so JUnit 
	//will pass this unit test. 
	@Test(expected = ArithmeticException.class)  
	public void testException() {
		assertEquals(5, divisionTest2.division());
	}
		
	//Test case for division
	@Test
	public void testOk2() {
		assertEquals(3, divisionTest3.division());
	}
	
		//Test case for division
	@Test
	public void testFail() {
		assertEquals(5, divisionTest3.division());
	}
}
