package Asem4.h6.factoryMethod;

public class LatteCreator extends CoffeeCreator{
    @Override
    public Coffee factoryMethod() {
        return new Latte();
    }
}
