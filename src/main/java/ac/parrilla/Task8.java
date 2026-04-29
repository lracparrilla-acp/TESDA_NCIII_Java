package ac.parrilla;

public class Task8 {

    public static void main(String[] args) {

        numbers(4, 5, 10);
        System.out.println();
        numbers(5, 6, 10);
    }

    private static void numbers(int... numbers) {
        for (int i : numbers) {
            int k = 0;
            for (int j = i; j > 0; j--) {
                k = k + j;
            }
            System.out.println(k);
        }
    }
}
