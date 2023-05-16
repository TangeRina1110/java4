package Asem4.h6.AbstractFactory;

public class Client {
    private final Latte Latte;
    private final Americano Americano;

    public Client(Factory factory) {
        Latte = factory.createLatte();
        Americano = factory.createAmericano();
    }

    public void execute() {
        Latte.print();
        Americano.print();
    }
}
