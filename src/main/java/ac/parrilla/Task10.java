package ac.parrilla;


public class Task10 {
    public static void main(String[] args) {

        Students[] students = new Students[]{
                new Students("Morgan", "Freeman"),
                new Students("Brad", "Pitt"),
                new Students("Kevin", "Spacey"),
        };

        for (Students s : students) {
            s.printFullName();
        }

    }
}

class Students {


    private String firstName;
    private String lastName;

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }


}