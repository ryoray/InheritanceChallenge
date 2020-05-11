public class Vehicle {

    private String mode;
    private String movement;
    private String track;

    public Vehicle(){

    }

    public Vehicle(String mode, String movement, String track) {
        this.mode = mode;
        this.movement = movement;
        this.track = track;
    }

    public String getMode() {
        return mode;
    }

    public String getMovement() {
        return movement;
    }

    public String getTrack() {
        return track;
    }
}
