package ru.stqa.pft1.sandbox;

public class Sallary {
    public static void main(String[] args) {
        hackSalary(7000);
    }

    public static void hackSalary(int a) {
        int b = a + 1000;
        System.out.println("Your salary is: "+ b + " dollars per month.");
    }
}
