package afs.training.oo;

public class Main {
    public static void main(String[] args) {
        Bus coolBus = new Bus("Cool Bus", 25);
        coolBus.speedUp();

        Truck bigTruck = new Truck("Big Truck", 20);
        bigTruck.speedUp();

        Driver busDriver = new Driver(coolBus);
        busDriver.drive();

        Driver truckDriver = new Driver(bigTruck);
        truckDriver.drive();

    }
}