package afs.training.oo;

public class Bus {

    private String name;

    private int speed;

    private int acceleration;

    public Bus(String name, int speed, int acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public String getName() {return name;}

    public int getSpeed() {return speed;}

    public void speedUp(){
        speed += acceleration;
        System.out.printf("%s: is running at %d km/h%n", name, speed);
    }
}
