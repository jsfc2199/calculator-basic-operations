package com.calculator.functional.programming;

import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class Application {

    public static void main(String[] args) {
        IAddition calculateAddition = (x, y) -> x + y;

        ISubtraction calculateSubtraction = (x, y) -> x - y;

        IMultiplication calculateMultiplication = (x, y) -> IntStream.iterate(x, i -> i).limit(y).reduce((acum, num) -> calculateAddition.addition(acum, x)).getAsInt();

        IDivision calculateDivision = (x, y) -> x == 0 ? 0 : IntStream.rangeClosed(0, x).reduce((acum, num) -> calculateMultiplication.mult(acum, y) <= x ? acum + 1 : acum).getAsInt() - 1;

        System.out.println("The multiplication is: " + calculateMultiplication.mult(2, 6));
        System.out.println("The addition is: " + calculateAddition.addition(5, 8));
        System.out.println("The substraction is: " + calculateSubtraction.subtraction(8, 7));
        System.out.println("The division is: " + calculateDivision.division(0, 9));
    }
}
