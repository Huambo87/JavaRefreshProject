package StaticClassesEnumsExceptions;

public class Main {
    public static void main(String[] args) {
        double result = Calculator.calculate(2, 3, Calculator.Type.MULTIPLICATION);
        System.out.println("Result: " + result);


        result = Calculator.calculate(2, 3, Calculator.Type.DIVISION);
        System.out.println("Result: " + result);


        result = Calculator.calculate(2, 3, null);
        System.out.println("Result: " + result);

        result = Calculator.calculate(2, 3, Calculator.Type.ADDITION);
        System.out.println("Result: " + result);

    }

}
