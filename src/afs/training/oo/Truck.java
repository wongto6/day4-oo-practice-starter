package afs.training.oo;

public class Truck {

    private String name;

    private int speed;

    private int acceleration;

    public Truck(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.acceleration = 2;
    }

    public String getName() {return name;}

    public int getSpeed() {return speed;}

    public void speedUp(){
        speed += acceleration;
        System.out.printf("%s: speed up to %d km/h%n", name, speed);
    }
}
