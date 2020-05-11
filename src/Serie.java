public class Serie extends Car{

    private String brand;
    private String model;
    private int year;
    private int gears;
    private int speed;

    public Serie() {

    }

    public Serie(String mode, String movement, String track, String fuel,
                 int wheel, String steering, String purpose, String brand,
                 String model, int year, int gears, int speed) {
        super(mode, movement, track, fuel, wheel, steering, purpose);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.gears = gears;
        this.speed = speed;
    }

    public void accelerate(int speed){
        if (speed >= 0) {
        int currentSpeed = getSpeed() + speed;
            System.out.println("The car " + getBrand() + " - " + getModel() +
                    " is accelerating " + speed + " and now moving at " + currentSpeed);
        } else {
            System.out.println("The car is decelerating or moving at constant speed");
        }
    }

    public void decelerate(int speed){
        if (speed <= getSpeed()) {
            int currentSpeed = getSpeed() - speed;
            System.out.println("The car " + getBrand() + " - " + getModel() +
                    " is decelerating " + speed + " and now moving at " + currentSpeed);
        } else {
            System.out.println("The car is accelerating or moving at constant speed");
        }
    }

    @Override
    public void steering() {
        System.out.println("Steering method in Serie class");
        super.steering();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }
}
