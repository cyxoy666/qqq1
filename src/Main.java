interface Electric {
    void charge();
}

interface FuelPowered {
    void refuel();

}
//asdasd
abstract class Vehicle {
    String brand;
    String model;
    void setDetails(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    abstract void drive();
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

abstract class Car extends Vehicle {
    int numberOfDoors;
    void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    abstract void honk();
}

class ElectricCar extends Car implements Electric {
    ElectricCar(String brand, String model, int numberOfDoors) {
        setDetails(brand, model);
        setNumberOfDoors(numberOfDoors);
    }
    @Override
    void drive() {
        System.out.println("Driving an electric car.");
    }
    @Override
    void honk() {
        System.out.println("Electric car horn: Beep Beep!");
    }
    @Override
    public void charge() {
        System.out.println("Charging the electric car.");
    }
}

class DieselCar extends Car implements FuelPowered {
    DieselCar(String brand, String model, int numberOfDoors) {
        setDetails(brand, model);
        setNumberOfDoors(numberOfDoors);
    }
    @Override
    void drive() {
        System.out.println("Driving a diesel car.");
    }
    @Override
    void honk() {
        System.out.println("Diesel car horn: Honk Honk!");
    }
    @Override
    public void refuel() {
        System.out.println("Refueling the diesel car.");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 4);
        DieselCar porshe = new DieselCar("Porsche", "911 GT3", 2);
        tesla.displayInfo();
        tesla.drive();
        tesla.honk();
        tesla.charge();
        System.out.println();
        porshe.displayInfo();
        porshe.drive();
        porshe.honk();
        porshe.refuel();
    }
}