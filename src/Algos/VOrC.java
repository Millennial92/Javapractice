package Algos;



import java.util.*;
public class VOrC {

    static void  ConOrVow( char x )
    {
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'
        || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
        {
            System.out.println( "The character entered is a vowel." );
        }
        else
        {
            System.out.println( "The character entered is a consonant." );
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the character to be checked :" );
        char y = sc.next().charAt(0);
        ConOrVow(y);
    }
}
