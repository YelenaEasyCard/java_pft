package ru.stqa.pft1.sandbox1;

import java.sql.SQLOutput;

public class CycleFor {
  public static void main(String[] args) {
    int summa = 0;
    int n = 10;
    for (int i = 0; i <= n; i +=2) {
      if (i % 2 == 0)
      summa += i; //0+2+4+6+8+10 = 30
      System.out.println("Сумма четных чисел от 0 до" + n + "=" + summa);
    }
    /*
    int i; //  если мы объявим переменную вначале
    for (i = 0; i <= 10; i++) {
      System.out.println(i + " ");
    }
    for (i = 0; i < 10; i += 2) {
      System.out.println(i);
    }
    for (i = 0; i < 16; i++) //нужно показать все числа, которые делятся на 2: от 0 до 16
      if (i % 2 == 0) {
        System.out.println("Число" + i + "");
   */
    //  если мы объявим переменную в каждом методе
    for (int i = 0; i <= 10; i++) {
      System.out.println(i + " ");
    }
    for (int i = 0; i < 10; i += 2) {
      System.out.println(i);
    }
    for (int i = 0; i < 16; i++) //нужно показать все числа, которые делятся на 2: от 0 до 16
      if (i % 2 == 0) {
        System.out.println("Число" + i + "");
      }
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0)
        System.out.println(i);
    }
  }
  }
