package ac.parrilla;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static double divide(int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Quotient: " + divide(a, b));

    }
}
