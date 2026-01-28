package interface_;

public class Main1 {

    public static void main(String[] args){

        Printer i;

        InkjetPrinter p = new InkjetPrinter();
        p.colour();
        p.print();

        LaserPrinter l = new LaserPrinter();
        l.colour();
        l.print();
        l.size();
        System.out.println(l.hashCode());
    }
}
