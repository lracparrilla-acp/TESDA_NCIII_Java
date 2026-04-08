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

        for (int i = 0; i <= input-1; i++){
            char s = (char) random.nextInt(33, 127 );
            sb.insert(i, s);
        }
        System.out.println(sb);


    }
}