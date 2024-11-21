package afs.training.oo.vehicle;

import afs.training.oo.Engine;

public class Bus extends Vehicle {

    private Engine engine;

    public Bus(String name, int speed, Engine engine) {
        super(name, speed, engine.getAcceleration());
        this.engine = engine;
    }

    public int getBusEngineAcceleration() {
        return engine.getAcceleration();
    }

}
