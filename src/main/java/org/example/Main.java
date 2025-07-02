package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calc = new Calculator();
        int a = 350;
        int b = 350;
        System.out.println(calc.add(a, b));
        System.out.println(calc.subtract(a, b));
    }
}