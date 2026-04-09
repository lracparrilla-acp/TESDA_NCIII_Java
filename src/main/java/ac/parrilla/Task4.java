package ac.parrilla;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will tell you if your word is a palindrome.");
        System.out.print("Enter your word: ");

        String word = scanner.next().toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(word).reverse();

        if (!word.equals(stringBuilder.toString())) {
            System.out.println("Your word \n" + stringBuilder.reverse() + "\nis NOT a palindrome.");
        } else System.out.println("Your word \n" + stringBuilder + "\nis a palindrome.");


    }
}