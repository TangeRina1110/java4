package Asem4.h6;
import Asem4.h6.AbstractFactory.Client;
import Asem4.h6.AbstractFactory.Factory;
import Asem4.h6.AbstractFactory.IceCreamFactory;
import Asem4.h6.AbstractFactory.SyropFactory;
import Asem4.h6.Builder.*;
import Asem4.h6.factoryMethod.*;
import Asem4.h6.Prototype.Packing;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory method example: ");
        CoffeeCreator[] coffeeCreators = {new LatteCreator(), new AmericanoCreator()};
        for (CoffeeCreator coffeeCreator : coffeeCreators) {
            Coffee coffee = coffeeCreator.factoryMethod();
            coffee.print();
        }
        System.out.println();

        System.out.println("Abstract factory example: ");
        Factory[] factories = {new SyropFactory(), new IceCreamFactory()};
        for (Factory factory : factories) {
            Client client = new Client(factory);
            client.execute();
        }
        System.out.println();

        System.out.println("Builder example: ");
        Builder[] builders = {new NaParuBuilder(), new BKBuilder()};
        for (Builder builder : builders) {
            Director director = new Director(builder);
            director.Construct();
            Restaurant car = builder.GetResult();
            car.print();
        }
        System.out.println();

        System.out.println("Prototype example: ");
        Packing originalPacking = new Packing();
        Packing[] packingArray = new Packing[5];
        for (int i = 0; i < 5; i++) {
            try {
                packingArray[i] = originalPacking.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            packingArray[0].print();
        }
        System.out.println();
    }
}