package com.calculator.functional.programming;

public class Application {

	public static void main(String[] args) {
		IAddition calculateAddition = (x,y)-> x+y;
		ISubtraction calculateSubtraction = (x,y)-> x-y;

		System.out.println("The addition is: " + calculateAddition.addition(5,8));
		System.out.println("The substraccion is: " + calculateSubtraction.subtraction(8,7));
	}
}
