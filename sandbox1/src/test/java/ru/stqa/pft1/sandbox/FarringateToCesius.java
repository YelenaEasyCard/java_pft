package ru.stqa.pft1.sandbox;

// перевод из цельсия в фарингейт
public class FarringateToCesius {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double TF = ((double) (celsius) * 9 / 5.0) + 32;
        return TF;
    }
}
