package com.java.soap;

public class CalculatorApp {

	public static void main(String[] args) {
		CalculatorService calculatorService=new CalculatorService();
		CalculatorIfc calculatorIfc=calculatorService.getCalculatorPort();
		System.out.println(calculatorIfc.add(10, 20));
	}
}