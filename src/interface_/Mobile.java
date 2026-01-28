package interface_;

public interface Mobile {

    public void call();

    public void battery();

    default void message(){
        System.out.println("Unlimited image sending message available");
    }
}
