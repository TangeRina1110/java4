package Asem4.h6.factoryMethod;

public class AmericanoCreator extends CoffeeCreator{
    @Override
    public Coffee factoryMethod() {
        return new Americano();
    }
}
