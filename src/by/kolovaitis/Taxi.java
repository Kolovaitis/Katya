package by.kolovaitis;

public interface Taxi extends Runnable {
    void run();

    void placeOrder(Order order);
}
