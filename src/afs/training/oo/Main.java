package afs.training.oo;

public class Main {

    public static void main(String[] args) {

        GasolineEngine gasolineEngine = new GasolineEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Bus coolBus = new Bus("Cool Bus", 25, electricEngine);
        coolBus.speedUp();

        Truck bigTruck = new Truck("Big Truck", 20);
        bigTruck.speedUp();

        Driver busDriver = new Driver(coolBus);
        busDriver.drive();

        Driver truckDriver = new Driver(bigTruck);
        truckDriver.drive();

        Bus gasolineBus = new Bus("Gasoline Bus", 25, gasolineEngine);
        Driver gasolineBusDriver = new Driver(gasolineBus);
        gasolineBusDriver.drive();

        Bus electrirBus = new Bus("Electric Bus", 25, electricEngine);
        Driver electricBusDriver = new Driver(electrirBus);
        electricBusDriver.drive();
    }
}