package afs.training.oo;

public class Bus extends Vehicle {

    private Engine engine;

    public Bus(String name, int speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

}
