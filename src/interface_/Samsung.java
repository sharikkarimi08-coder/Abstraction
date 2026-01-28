package interface_;

public class Samsung implements Mobile{

    @Override
    public void call(){
        System.out.println("Better network Quality");
    }

    @Override
    public void battery(){
        System.out.println("fast charging");
    }
}
