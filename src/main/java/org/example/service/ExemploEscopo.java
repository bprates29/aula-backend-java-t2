package org.example.service;

public class ExemploEscopo {
    public static void main(String[] args) {
        int x = 50;

        if (x > 0) {
            int y = 100;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
        int a = 0;
        metodo(a);
        //System.out.println("y: " + y);
    }

    public static void metodo(int a) {
        //int a = 10;
        System.out.println("O valor de a é: " + a);
    }
}
