package interface_;

public class InkjetPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing using inkjet");
    }

    @Override
    public void size() {
        System.out.println("Printing in A4 size");
    }

    @Override
    public void colour() {
        System.out.println("Printing using water colour");
    }
}
