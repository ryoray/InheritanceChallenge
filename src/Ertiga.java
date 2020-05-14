public class Ertiga extends Car{

    private int roadServiceMonths;

    public Ertiga(int roadServiceMonths) {
        super("Ertiga", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;

    }

    public void accelearte(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        }  else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(4);
        }  else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    //    private String brand;
//    private String model;
//    private int year;
//    private int speed;
//
//    public Ertiga() {
//
//    }
//
//    public Ertiga(String mode, String movement, String track, String fuel, int wheel,
//                  String purpose, String steering, int doors, String brand,
//                  String model, int year, int speed) {
//        super(mode, movement, track, fuel, wheel, purpose, steering, doors);
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//        this.speed = speed;
//    }
//
//    public void accelerate(int speed){
//        if (speed >= 0) {
//        int currentSpeed = getSpeed() + speed;
//            System.out.println("The car " + getBrand() + " - " + getModel() +
//                    " is accelerating " + speed + " and now moving at " + currentSpeed);
//        } else {
//            System.out.println("The car is decelerating or moving at constant speed");
//        }
//    }
//
//    public void decelerate(int speed){
//        if (speed <= getSpeed()) {
//            int currentSpeed = getSpeed() - speed;
//            System.out.println("The car " + getBrand() + " - " + getModel() +
//                    " is decelerating " + speed + " and now moving at " + currentSpeed);
//        } else {
//            System.out.println("The car is accelerating or moving at constant speed");
//        }
//    }
//
//    @Override
//    public void steering() {
//        System.out.println("Steering method in Serie class");
//        super.steering();
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
}
