package StaticClassesEnumsExceptions;

public class Calculator {

//    public static final int MULTIPLICATION = 1;
//    public static final int ADDITION = 2;
//    public static final int DIVISION = 3;
//    public static final int SUBTRACTION = 4;

//    Enum final constants:

    public enum Type {
        MULTIPLICATION,
        ADDITION,
        DIVISION,
        SUBTRACTION
    }


    public static double calculate(double a, double b, Type type) {
        double result = 0;

//        This is how it can be done with 'if else'.
//        if(type == MULTIPLICATION){
//            return a * b;
//        }
//
//        else if(type == ADDITION){
//        }

//        This is how it can be done with a Switch Case.

        try {

            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;

                case ADDITION:
                    result = a + b;
                    break;

                case DIVISION:
                    result = a / b;
                    break;

                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = -1;
            }
        } catch (Exception err) {
            System.out.println("Something goes wrong!");
            throw err;
        }

//        finally {
//            System.out.println("Finally block!");
//            result = -1;
//        }

        return result;
    }
}
