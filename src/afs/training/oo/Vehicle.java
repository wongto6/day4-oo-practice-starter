package afs.training.oo;

public class Vehicle {

    protected String name;

    protected int speed;

    protected int acceleration;

    public Vehicle(String name, int speed, int acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp() {
        speed += acceleration;
        System.out.printf("%s: speedup to %d km/h%n", getName(), getSpeed());
    }

}
