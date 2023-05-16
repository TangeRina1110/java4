package Asem4.h6.AbstractFactory;

public class SyropFactory implements Factory {
    public Latte createLatte() {
        return new LatteWithSyrop();
    }

    public Americano createAmericano() {
        return new AmericanoWithSyrop();
    }
}
