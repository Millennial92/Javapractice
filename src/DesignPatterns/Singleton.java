package DesignPatterns;

public class Singleton {

    private static Singleton objS;

    private Singleton() {

    }

    public static Singleton getInstance()
    {
        if(objS == null)
        {
            objS = new Singleton();
        }
        return objS;
    }
public void getConnection() {

        System.out.println(" You are now connected to the database.");
}


 public static void main(String[]args)
 {
     Singleton ob1;

     ob1 = Singleton.getInstance();
     ob1.getConnection();

 }

}
