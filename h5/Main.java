package Asem4.h5;

public class Main {
    public static void main(String[] args) {
        Singleton_1 singleton1 = Singleton_1.getInstance();
        Singleton_1 singleton1Copy = Singleton_1.getInstance();

        Singleton_2 singleton2 = Singleton_2.getInstance();
        Singleton_2 singleton2Copy = Singleton_2.getInstance();
        Singleton_2 singleton2AnotherCopy = Singleton_2.INSTANCE;

        Singleton_3 singleton3 = Singleton_3.getInstance();
        Singleton_3 singleton3Copy = Singleton_3.getInstance();

        MyClass obj = new MyClass();
        MyClass objCopy = new MyClass();

        System.out.println("Hash code Singleton1:");
        System.out.println(singleton1.hashCode() + " " + singleton1Copy.hashCode());

        System.out.println("Hash code Singleton2:");
        System.out.println(singleton2.hashCode() + " " +
                singleton2Copy.hashCode() + " " + singleton2AnotherCopy.hashCode());

        System.out.println("Hash code Singleton3:");
        System.out.println(singleton3.hashCode() + " " +
                singleton3Copy.hashCode());

        System.out.println("Hash code MyClass:");
        System.out.println(obj.hashCode() + " " +
                objCopy.hashCode());



    }
}
