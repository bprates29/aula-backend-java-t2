package org.example.service;

import java.math.BigDecimal;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite o seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Conta ativa? (true/false): ");
        boolean contaAtiva = sc.nextBoolean();

        System.out.println("Resumo do Cadastro:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("Conta Ativa: " + (contaAtiva ? "Sim" : "Não"));

        sc.close();
    }
}
