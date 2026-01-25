public class PNB implements  RBI{
    @Override
    public void interest() {
        System.out.println("10% interest");
    }

    @Override
    public void widrwal() {
        System.out.println("PNB withrwal");
    }

    @Override
    public void deposit() {
        System.out.println("PNB deposit");
    }
}
