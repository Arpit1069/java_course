package lab;

import java.util.Scanner;

// Abstract class representing a Vehicle
abstract class Vehicle {
    public abstract void move();
}

// Concrete classes representing different types of Vehicles
class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class _4VehicleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Ordering System!");
        System.out.println("Please select the type of vehicle you want to order:");
        System.out.println("1. Helicopter");
        System.out.println("2. Car");
        System.out.println("3. Train");

        int choice = scanner.nextInt();
        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = new Helicopter();
                break;
            case 2:
                vehicle = new Car();
                break;
            case 3:
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return;
        }

        System.out.println("You have ordered a vehicle.");
        vehicle.move();

        scanner.close();
    }
}

