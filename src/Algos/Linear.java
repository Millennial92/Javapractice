package Algos;

import java.util.*;
public class Linear {

    static int search(int[] arr, int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
                return i;
        }
    return -1;
    }
public static void main(String[]args)
{

    System.out.println("Enter the number of members of the array :\n");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter the members of the array :\n");
    int []arr = new int[n];

    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the number to be searched :\n");
    int x = sc.nextInt();
    int a = search(arr,n,x);
    if(a == -1)
    {
        System.out.println("There is no such element in the array.\n");
    }
    else
    {
        System.out.println("The element "+ x +" is found in "+ (a+1) +"th position");
    }


}
}
