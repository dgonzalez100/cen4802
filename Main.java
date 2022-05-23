package fib;

import java.util.*;

public class Main
{
    public static int fibonacci(int n)
    {
    if (n <= 1)
       return n;
    return fibonacci(n-1) + fibonacci(n-2);
    }
    //main() method 
    public static void main (String args[])
    {
    //delare one variable n
    int n;
    Scanner scnr=new Scanner(System.in);

    System.out.println("Enther value of n: ");
    n=scnr.nextInt();
        
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}
