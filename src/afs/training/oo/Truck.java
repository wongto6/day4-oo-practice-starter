package afs.training.oo;

public class Truck extends Vehicle {

    public Truck(String name, int speed) {
        super(name, speed, 2);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

}
