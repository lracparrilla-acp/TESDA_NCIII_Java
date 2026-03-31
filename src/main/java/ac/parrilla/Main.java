package ac.parrilla;


import java.util.Random;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        System.out.println("Input how many characters: ");
        int input = scanner.nextInt();

        for (int i = 0; i <= input; i++){
            char s = (char) random.nextInt(Character.MAX_VALUE+1);
            sb.insert(i, s);
        }
        System.out.println(sb);


    }
}