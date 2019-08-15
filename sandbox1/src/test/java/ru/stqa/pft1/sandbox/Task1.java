package ru.stqa.pft1.sandbox;

import java.io.IOException;

public class Task1 {        // ИМЯ КЛАССА
    private static String TEXT = "Kiss my ass";   //ПЕРЕМЕННАЯ КЛАССА

    public static void main(String[] args) throws IOException { // ВЫЗОВ МЕТОДА MAIN
        System.out.println(TEXT);   //КОМАНДА ВЫВОД ТЕКСТА НА ЭКРАН
        String s = "Ho-ho-ho!"; //объявление переменной
        printTextMoreTimes(s, 3);   //вызов метода
    }

    public static void printTextMoreTimes(String s, int count) {// Заголовок метода printTextMoreTimes
        for (int i = 0; i < count; i++) {  //        цикл
            System.out.println(s);
        }
    }
}

