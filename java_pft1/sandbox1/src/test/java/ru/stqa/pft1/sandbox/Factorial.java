package ru.stqa.pft1.sandbox;

public class Factorial {
    public static long factorial(int n) {
        if (n <= 1)     // base case
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
            System.out.println(factorial(i));
    }

}