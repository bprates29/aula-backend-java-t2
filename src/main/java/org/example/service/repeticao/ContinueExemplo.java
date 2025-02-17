package org.example.service.repeticao;

public class ContinueExemplo {
    public static void main(String[] args) {
        for (int pedaco = 1; pedaco <= 5; pedaco++) {
            if (pedaco == 3) {
                System.out.println("Pow, esse pedaço tá queimado! Esse: " + pedaco);
                break;
            }

            System.out.println("Comendo pedaço! Esse: " + pedaco);
        }
    }

}
