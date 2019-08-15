package ru.stqa.pft1.sandbox;

public class DogName {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
        System.out.println(dog1.name);
        //write your code here
    }

    public static class Dog {
        public String name;
    }
}
