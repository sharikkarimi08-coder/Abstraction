package interface_;

public class LaserPrinter implements Printer{

    @Override
    public void print(){
        System.out.println("Printing using laser printer");
    }

    @Override
    public void size(){
        System.out.println("printing using A2 size");
    }

    @Override
    public void colour(){
        System.out.println("Printing using Artificial colour");
    }
}
