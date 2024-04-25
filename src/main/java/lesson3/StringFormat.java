package lesson3;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Vassili";
        String gender = "male";
        int age = 33;
        double salary = 5000.50d;

//        System.out.println("His name is " + name + ". He is a " + gender + " of " + age + ". His monthly salary is " + salary + ".");

        System.out.println(String.format("My friend's name is %s. He is a %s of %d. His salary is %f a month.", name, gender, age, salary));



    }
}
