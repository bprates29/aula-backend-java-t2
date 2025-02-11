package org.example.service;

import java.util.Scanner;

public class ErroComum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();
        var enter = sc.nextLine(); // correção do bug
        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        if (enter.isBlank()) {
            System.out.println("\nvazio!\n");
        } else {
            System.out.println("\nNão vazio\n");
        }
        System.out.println("Cidade: " + cidade + enter + "\n Saldo: " + saldo);
    }
}
