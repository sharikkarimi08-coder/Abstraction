package interface_;

public class Main {
    public static void main(String[] args) {
        RBI r;

        RBI.printData();
         r = new SBI();
        System.out.println(r.hashCode());

         r = new PNB();
         r.deposit();
        System.out.println(r.hashCode());




    }
}
