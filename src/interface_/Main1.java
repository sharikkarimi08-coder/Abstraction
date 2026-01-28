package interface_;

public class Main1 {

    public static void main(String[] args){

        Printer i;

        i = new InkjetPrinter();
        i.colour();
        i.print();

        i = new LaserPrinter();
        i.colour();
        i.print();
        i.size();
        System.out.println(i.hashCode());
    }
}
