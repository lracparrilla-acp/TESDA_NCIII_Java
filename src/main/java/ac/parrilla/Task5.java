package ac.parrilla;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will accept 3 numbers, and will output the largest number, otherwise it will print \"All numbers are equal.\"");

        int count = 0;
        do {
            System.out.println("Enter your number");
            al.add(scanner.nextInt());
            ++count;
        } while (count != 3);
        al.sort(null);
        System.out.println((al.get(0).equals(al.get(1)) && al.get(1).equals(al.get(2))) ? "All numbers are equal" : al.get(2));
    }
}
