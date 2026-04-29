package ac.parrilla;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        BigDecimal bd1 = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));
        System.out.println("Enter 2nd number");
        BigDecimal bd2 = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));
        System.out.println("Addition: " + bd1.add(bd2));
        System.out.println("Subtraction: " + bd1.subtract(bd2));
        System.out.println("Multiplication: " + bd1.multiply(bd2));
        System.out.println(bd2.equals(BigDecimal.ZERO) ? "Cannot divide by zero." : "Division: " + bd1.divide(bd2, 10, RoundingMode.HALF_EVEN));
    }
}
