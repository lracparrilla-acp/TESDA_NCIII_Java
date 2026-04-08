/*
Class name Task3:
Change the variables in the first section, so that each if statement resolves as true.
*/

package ac.parrilla;

public class Task3 {
    public static void main(String[] args) {

        String a = "Wow";
        String b = a;
        String c = "Different";
        String d = "Wow!";

        boolean bl = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (bl && b2 && b3) {
        System.out.println("Success!");
        }


    }
}
