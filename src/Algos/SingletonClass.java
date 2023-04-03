package Algos;

public class SingletonClass {

    private static SingletonClass obj = null;
    public String s;

    private SingletonClass() {
        s = "Hello, I am the string part of the Singleton class.";
    }

    public static synchronized SingletonClass getInstance() {
        if (obj == null)
            obj = new SingletonClass();

        return obj;
    }
}

class Main {
    public static void main(String[] args) {

        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();

        System.out.println("Hashcode of x is "+ x.hashCode());
        System.out.println("Hashcode of y is "+ y.hashCode());
        System.out.println("Hashcode of z is "+ z.hashCode());

        if(x == y && y == z) {
            System.out.println("The three objects point to the same memory location on the heap i.e. to the same object.");
        }
        else {
            System.out.println("The three objects do not point to the same memory location.");
        }
    }
}