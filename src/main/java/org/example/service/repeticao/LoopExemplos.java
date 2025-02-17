package org.example.service.repeticao;

public class LoopExemplos {
    public static void main(String[] args) {
        for (int comFome = 1; comFome < 4; comFome++) {
            System.out.println("Ainda com fome... Comendo mais um pedaço...");
        }
        System.out.println("Satisfeito!");

        // ##### WHILE #####
        boolean comFome = false;

        while (comFome) {
            System.out.println("Ainda com fome... Comendo mais um pedaço!");
            comFome = Math.random() > 0.3; // Simula a satifação aleatória
        }

        do {
            System.out.println("Comendo mesmo sem fome...");
            comFome = Math.random() > 0.3; // Simula a satifação aleatória
        } while (comFome);

        String[] comidas = {"Hamburguer", "Pizza", "Sushi", "Churrasco"};

        for (String comida : comidas) {
            System.out.println("Hoje eu quero comer: " + comida);
        }

    }

}
