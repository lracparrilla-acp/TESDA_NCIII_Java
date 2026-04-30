package ac.parrilla;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(Car car) {
        System.out.println("Car details:\n" +
                "Make: " + car.getMake() + "\n" +
                "Model: " + car.getModel() + "\n" +
                "Year: " + car.getYear() + "\n" +
                "Number of Doors: " + car.getNumberOfDoors());
    }
}

public class Task13 {
    public static void main(String[] args) {
//        Car car = new Car ("Mercedes Benz", "A35 AMG", 2026, 4);
        Car car2 = new Car("Toyota", "Camry", 2022, 4);
        car2.displayDetails(car2);
    }
}
