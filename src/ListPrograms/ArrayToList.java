package ListPrograms;

import java.util.*;
public class ArrayToList {


    public static <T> List <T> convertArrayToList ( T Array[] )

    {

        List <T> list = new ArrayList <>();

        Collections.addAll ( list , Array );

    return list;
    }

    public static void main ( String args[] )
    {
        String array[] = {" Geeks " , " forGeeks " , " A computer Portal "};

        System.out.println ( " Array : " + Arrays.toString( array ));

        List < String > list = convertArrayToList ( array );

        System.out.println ( " List : " + list );
    }
}
