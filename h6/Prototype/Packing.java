package Asem4.h6.Prototype;

public class Packing implements Cloneable{
    public void print() {
        System.out.println("Прототип");
    }

    @Override
    public Packing clone() throws CloneNotSupportedException {
        return (Packing) super.clone();
    }
}
