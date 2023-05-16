package Asem4.h6.AbstractFactory;

public class IceCreamFactory implements Factory{
    public Latte createLatte(){
        return new LatteWithIceCream();
    }
    public Americano createAmericano(){
        return new AmericanoWithIceCream();
    }
}
