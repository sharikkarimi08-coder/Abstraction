package abstractClass;

public class Main {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.stop();
        v.start();
        v.mileage();
    }
}
