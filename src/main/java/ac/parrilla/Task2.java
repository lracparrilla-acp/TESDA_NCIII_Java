/*Create all the primitives (except long and double) with different values.
  Concatenate them into a string and print it to the screen so it will print:
  H3110 world 2.0 true
 */
package ac.parrilla;

public class Task2 {
    public static void main(String[] args) {

        char letterH = 'H';
        char letterW = 'w';
        char letterR = 'r';
        char letterL = 'l';
        char letterD = 'd';
        byte byteNum = 0;
        short shortNum = 3;
        int intNum = 110;
        float floatNum = 2.0f;
        boolean isTrue = true;

        String output = letterH + "" + shortNum + intNum + " " + letterW + byteNum + letterR + letterL + letterD + " " + floatNum + " " + isTrue;
        System.out.println(output);
    }
}