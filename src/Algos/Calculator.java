package Algos;

import java.util.*;

public class Calculator
{
   public static void main(String[]args) {
       double num1, num2;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the numbers :");
       num1 = sc.nextDouble() ;
       num2 = sc.nextDouble();
       System.out.println("Enter the operator : (+,-,*,/)");
       char op = sc.next().charAt(0);
       double o = 0;

       switch (op) {
           case '+' -> o = num1 + num2;
           case '-' -> o = num1 - num2;
           case '*' -> o = num1 * num2;
           case '/' -> o = num1 / num2;
           default -> System.out.println("You have entered a wrong operator.");
       }

       System.out.println("The final result :");
       System.out.println();
       System.out.println(num1 + " " + op + " " + num2 + " = " + o);
   }
   }