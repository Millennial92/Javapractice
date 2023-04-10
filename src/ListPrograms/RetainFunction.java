package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RetainFunction {

public static void main(String[]args)

 {
    ArrayList list1 = new ArrayList(Arrays.asList("My" , "Name" , "Is" , "Thomas" , "Shelby" , 4 , 34 , 777));
     System.out.println(list1);

    ArrayList list2 = new ArrayList(Arrays.asList("Thomas" , "Shelby" , "is" , "my" , "name" , 777));
     System.out.println(list2);

    list1.retainAll(list2);
    System.out.println("\nThe elements common in both the strings are :" + list1);

 }

}
