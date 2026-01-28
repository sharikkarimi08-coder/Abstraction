package interface_;

public class Iphone implements Mobile{

    @Override
    public void call(){
        System.out.println("5G Network");
    }

    @Override
    public void battery(){
        System.out.println("24 Hrs Battery life on a single charge");
    }
}
