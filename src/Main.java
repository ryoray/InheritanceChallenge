public class Main {

    public static void main(String[] args) {
        Serie ertiga = new Serie("Road car", "manual",
                "road","gasoline",4,"power",
                "mpv","Suzuki","Ertiga",2018,
                5,60);

        ertiga.accelerate(10);
        ertiga.decelerate(15);

        ertiga.steering();
    }
}
