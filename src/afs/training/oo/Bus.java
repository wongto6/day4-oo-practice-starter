package afs.training.oo;

public class Bus {

    private String name;

    private int speed;

    private int acceleration;

    public Bus(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.acceleration = 5;
    }

    public String getName() {return name;}

    public int getSpeed() {return speed;}

    public void speedUp(){
        speed += acceleration;
        System.out.printf("%s: speedup to %d km/h%n", name, speed);
    }
}
