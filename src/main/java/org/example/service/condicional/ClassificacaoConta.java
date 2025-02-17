package org.example.service.condicional;

import java.util.Scanner;

public class ClassificacaoConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        // Conta preium, Padrão ou Básica
        String tipoConta = saldo > 10000
                ? "Conta Premium" : saldo >= 1000
                ? "Conta Padrão" : "Conta basica";

        System.out.println("Seu tipo de conta é: " + tipoConta);
        sc.close();
    }
}
