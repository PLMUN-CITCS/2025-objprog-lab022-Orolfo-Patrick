// Define the Car class
class Car {
    // Attributes of the Car class
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class
public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();

        // Assign values to the object's attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the method to display the car's information
        myCar.displayInfo();
    }
}
