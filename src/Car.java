public class Car extends Vehicle{

    private String fuel;
    private int wheel;
    private String purpose;
    private String steering;

    public Car() {

    }

    public Car(String mode, String movement, String track,
               String fuel, int wheel, String steering, String purpose) {
        super(mode, movement, track);
        this.fuel = fuel;
        this.wheel = wheel;
        this.steering = steering;
        this.purpose = purpose;
    }

    public void steering() {
        System.out.println("Steering method in Car class");
    }

    public String getFuel() {
        return fuel;
    }

    public int getWheel() {
        return wheel;
    }

    public String getSteering() {
        return steering;
    }

    public String getPurpose() {
        return purpose;
    }
}
