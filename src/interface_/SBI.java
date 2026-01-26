package interface_;

public class SBI implements RBI {
    @Override
    public void interest() {
        System.out.println("7% interest");
    }

    @Override
    public void widrwal() {
        System.out.println("SBI withrwal");
    }

    @Override
    public void deposit() {
        System.out.println("SBi deposit");
    }
}
