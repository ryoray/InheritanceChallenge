public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocilty " + speed + " direction " + direction);
        move(speed, direction);
    }

    //    private String fuel;
//    private int wheel;
//    private String purpose;
//    private String steering;
//    private int doors;
//    private int gears;
//
//    private int currentGear;
//
//    public Car() {
//
//    }
//
//    public Car(String mode, String movement, String track,
//               String fuel, int wheel, String purpose, String steering, int doors) {
//        super(mode, movement, track);
//        this.fuel = fuel;
//        this.wheel = wheel;
//        this.purpose = purpose;
//        this.steering = steering;
//        this.doors = doors;
//    }
//
//    public void changeGear(int currentGear) {
//        this.currentGear = currentGear;
//        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
//    }
//
//    public void changeVelocity(int speed, int direction) {
//        move(speed, direction);
//        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
//    }
//
//    public void steering() {
//        System.out.println("Steering method in Car class");
//    }
//
//    public String getFuel() {
//        return fuel;
//    }
//
//    public int getWheel() {
//        return wheel;
//    }
//
//    public String getSteering() {
//        return steering;
//    }
//
//    public String getPurpose() {
//        return purpose;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public int getGears() {
//        return gears;
//    }
//
//    public void setCurrentGear(int currentGear) {
//        this.currentGear = currentGear;
//    }
}
