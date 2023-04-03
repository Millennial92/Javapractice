package ListPrograms;

import java.util.*;

class SortArray {
    public static void main(String[]args)
    {
        ArrayList list = new ArrayList();

        list.add("My");
        list.add("Name");
        list.add("Is");
        list.add("Thomas");
        list.add("Shelby");

        System.out.println("The unsorted list :" + list);

        Collections.sort(list);

        System.out.println("Sorted Arraylist :" + list);

    }
}