package week6;

public class Car {

    String model;
    int maxSpeed;
    boolean start;

    public Car(String model, int maxSpeed, boolean start) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.start = start;

    }

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    void setStart() {
        start = true;
    }

}
