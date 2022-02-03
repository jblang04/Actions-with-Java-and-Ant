package com.javawithease.business;

/**
 * This is simple java class containing division method.
 * @author javawithease
 */
public class DivisionTest {
	//data members
	int num1, num2;
	
	//parameterised constructor
	public DivisionTest(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//division method
	public int division() throws ArithmeticException{
		return num1/num2;
	}
}
