package interface_;

public class Main2 {

    public static void main(String[] args){

        Mobile m;

        m = new Samsung();
        m.call();
        m.battery();
        m.hashcode();

        m = new Iphone();
        m.message();
        m.call();
        m.battery();
    }
}
