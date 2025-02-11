package org.example.service;

public class TempoDeVida {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int y = -1; // y é recriado e reinicializado a cada loop
            System.out.println("y começa com: " + y);
            y = 100;
            System.out.println("y agora é: " + y);
        }
    }
}
