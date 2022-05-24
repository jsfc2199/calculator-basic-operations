package com.calculator.functional.programming;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        IAddition calculateAddition = (x, y) -> x + y;

        ISubtraction calculateSubtraction = (x, y) -> x - y;

        IMultiplication calculateMultiplication = (x,y)-> IntStream.rangeClosed(0,y).reduce((n,g)->calculateAddition.addition(n,x)).getAsInt();

        System.out.println("The multiplication is: " + calculateMultiplication.mult(87,14));
		System.out.println("The addition is: " + calculateAddition.addition(5,8));
		System.out.println("The substraccion is: " + calculateSubtraction.subtraction(8,7));
    }
}
