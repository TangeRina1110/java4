package Asem4.h5;

public class Singleton_1 { // synchronized accessor
    private static Singleton_1 instance;
    private Singleton_1 (){};
    public static synchronized Singleton_1 getInstance() {
        if(instance == null) {
            instance = new Singleton_1();
            return instance;
        }
        return instance;
    }

}
