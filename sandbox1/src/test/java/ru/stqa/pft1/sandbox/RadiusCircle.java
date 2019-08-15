package ru.stqa.pft1.sandbox;

public class RadiusCircle {
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        double pi = 3.14; //write your code here
        double C = 2 * pi * radius;
        System.out.println(C);
    }
}
