package afs.training.oo;

public class Bus extends Vehicle {

    private Engine engine;

    public Bus(String name, int speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
        this.engine = engine;
    }

    public int getEngineSpeed() {
        return engine.getAcceleration();
    }

}
