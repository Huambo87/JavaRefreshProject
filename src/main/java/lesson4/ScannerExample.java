package lesson4;

import java.util.HashMap;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> toys = new HashMap<>();

        toys.put(25, "Bat-mobile");
        toys.put(39, "Light Saber");
        toys.put(101, "Wonder Woman");
        toys.put(205, "Hello Kitty Bag");
        toys.put(32, "Hello Kitty Bag");
        toys.put(36, "Junior QA Analyst Doll");

        System.out.println("What is the Toy ID?");

        int id = Integer.parseInt(scan.next());

        if (id != 25 && id != 39 && id != 101 && id != 205 && id != 32 && id != 36) {

            System.out.println("There is No Such Item in Catalog");
        } else {

            System.out.println(toys.get(id));
        }
    }
}



