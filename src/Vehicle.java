public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        currentVelocity = 0;
    }

    //    private String mode;
//    private String movement;
//    private String track;
//
//    private int currentVelocity;
//    private int currentDirection;
//
//    public Vehicle(){
//
//    }
//
//    public Vehicle(String mode, String movement, String track) {
//        this.mode = mode;
//        this.movement = movement;
//        this.track = track;
//
//        this.currentVelocity = 0;
//        this.currentDirection = 0;
//    }
//
//    public void steer(int direction) {
//        this.currentDirection += direction;
//        System.out.println("Vehicle.steer(): Steering at " +
//                currentDirection + " degrees.");
//    }
//
//    public void move (int velocity, int direction) {
//        currentVelocity = velocity;
//        currentDirection = direction;
//        System.out.println("Vehicle.move(): Moving at " + currentVelocity +
//                " in direction " + currentDirection);
//    }
//
//    public void stop() {
//        this.currentVelocity = 0;
//    }
//
//    public String getMode() {
//        return mode;
//    }
//
//    public String getMovement() {
//        return movement;
//    }
//
//    public String getTrack() {
//        return track;
//    }
}
