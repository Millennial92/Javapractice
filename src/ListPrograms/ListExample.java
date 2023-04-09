package ListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

    public static void main(String[]args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer> ();

        list1.add(0 , 87484488);
        list1.add(1 , 9434353);
        list1.add(2 , 445353);
        list1.add(3 , 686784785);
        list1.add(4 , 5678489);

        System.out.println(list1);

        list1.set(4 , 6784902);
        System.out.println(list1);

        list1.add(5 , 111111111);
        list1.add(6 , 348753857);
        System.out.println(list1);

        System.out.println(list1.get( 5 ));


        list1.removeIf(n -> ( n % 3 == 0));
        System.out.println(list1);



    }
}
