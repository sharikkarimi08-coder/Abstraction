package abstractClass;

abstract class Vehicle {


    abstract void start();

    abstract void mileage();

    public void stop(){
        System.out.println("Vehicle stop");
    }
}
