package org.example.service.condicional;

import java.util.Scanner;

public class MenuBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Seu saldo é 1000,00");
        } else if (opcao == 2) {
            System.out.println("Deposito realizado com sucesso!");
        } else if (opcao == 3) {
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Opção invalida!");
        }

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é 1000,00");
                //varias coisas
                break;
            case 2:
                System.out.println("Deposito realizado com sucesso!");
                // dasdasdsad
                break;
            case 3:
                System.out.println("Saque efetuado!");
                break;
            default:
                System.out.println("Opção invalida!");
        }

        sc.close();

        // expressão_condicional ? valor_se_verdadeiro : valor_se_falso

    }
}
