package afs.training.oo;

public class Bus extends Vehicle {

    public Bus(String name, int speed) {
        super(name, speed, 5);
    }

    public String getName() {return name;}

    public int getSpeed() {return speed;}

}
