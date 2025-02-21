package org.example.service.repeticao;

public class LoopInfinito {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            System.out.println("Rodando...");
            x--;
        }
    }
}
