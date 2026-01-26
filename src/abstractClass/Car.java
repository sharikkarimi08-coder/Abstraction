package abstractClass;

public class Car extends  Vehicle{
    @Override
    void start() {
        System.out.println("car start");
    }

    @Override
    void mileage() {
        System.out.println("mileaged drop");
    }

}
