package org.example.service.repeticao;

public class DoWhileBrackAndContinue {
    public static void main(String[] args) {
        int comidaDisponivel = 5;
        int pedaco = 0;
        boolean comFome = true;

        do {
            pedaco++;
            if (pedaco == 3) {
                System.out.println("Opa pedaço estragado: " + pedaco);
                comidaDisponivel--;
                continue;
            }
            System.out.println("Comendo pedaço " + pedaco);
            comidaDisponivel--;

            if (comidaDisponivel == 0) {
                System.out.println("Acabou a comida!");
                break;
            }

            comFome = Math.random() > 0.1;
        } while (comFome);

        System.out.println("Refeição Finalizada!");
    }
}
