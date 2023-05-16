package Asem4.h5;

public class Singleton_3 {// synchronized accessor
    private static final Singleton_3 instance = new Singleton_3();
    private Singleton_3(){};
    public static Singleton_3 getInstance() {
        return instance;
    }
}
