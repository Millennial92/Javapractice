package Algos;

import java.util.*;
public class PascalsTriangle {

     public int factorial ( int a )
     {
         if ( a == 0 )
             return 1;

         return a * factorial ( a - 1 );
     }

     public static void main ( String [] args )
     {

         int k = 4;
         int a , b;

         PascalsTriangle p = new PascalsTriangle ();

         for ( a = 0; a <=k ; a++ )
         {
             for ( b =0; b <= k-a ; b++ )
             {
                 System.out.println (" ");
             }
             for ( b = 0; b <= a; b++)
             {
                 System.out.println( " " + p.factorial(a) / (p.factorial (a - b ) * p.factorial(b)));
             }
             System.out.println();
         }
     }
}
