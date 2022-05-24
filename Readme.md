# Calculator

Calculator using functional programming in java

## Programms

It is recommended to have a text viewer, preferably IntelliJ and to have java 8 or higher installed.




## Code functional interfaces

```python
IAddition calculateAddition = (x, y) -> x + y;

ISubtraction calculateSubtraction = (x, y) -> x - y;

IMultiplication calculateMultiplication = (x, y) -> IntStream.iterate(x, i -> i).limit(y)
        .reduce((acum, num) -> calculateAddition.addition(acum, x)).getAsInt();

IDivision calculateDivision = (x, y) -> x == 0 ? 0 : IntStream.rangeClosed(0, x)
        .reduce((acum, num) -> calculateMultiplication.mult(acum, y) <= x ? acum + 1 : acum).getAsInt() - 1;

```
## Prints

```python
System.out.println("The multiplication is: " + calculateMultiplication.mult(2, 6));
System.out.println("The addition is: " + calculateAddition.addition(5, 8));
System.out.println("The substraction is: " + calculateSubtraction.subtraction(8, 7));
System.out.println("The division is: " + calculateDivision.division(0, 9));

```

[![imagen.png](https://i.postimg.cc/sDTM9tt1/imagen.png)](https://postimg.cc/xcbj9FjS)