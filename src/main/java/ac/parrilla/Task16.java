package ac.parrilla;

interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        System.out.println("put gorilla food into cage.");
        //put gorilla food into cage.
        return true;

    }

    @Override
    public void groom() {
        System.out.println("lather, rinse, repeat.");
        //lather, rinse, repeat.

    }

    @Override
    public void pet() {
        System.out.println("pet at your own risk.");
        //pet at your own risk.
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
