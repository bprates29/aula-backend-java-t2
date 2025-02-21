package org.example.service.repeticao;

public class ForeachContinue {
    public static void main(String[] args) {
        String[] comidas = {"Hamburguer", "Pizza", "Sushi estragado", "Churrasco"};

        for (String comida : comidas) {
            if (comida.equals("Sushi estragado")) {
                System.out.println("Eita sushi estragado! Passei mal! Pulando...");
                continue;
            }

            System.out.println("Comendo: " + comida);
        }
    }
}
