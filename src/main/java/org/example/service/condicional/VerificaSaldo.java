package org.example.service.condicional;

import java.util.Scanner;

public class VerificaSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque < saldo) {
            saldo -= saque; //Atualizar o saldo
            System.out.println("Saque realizado! Novo saldo: " + saldo);
        } else if (saque == saldo) {
            saldo -= saque; //Atualizar o saldo
            System.out.println("Você realizou o saque total, seu saldo é 0");
        } else {
            System.out.println("Saldo insuficiente! Vai colocar mais dinheiro!");
        }

        System.out.println("Seu saldo final é: " + saldo);

        sc.close();

//        switch (expressão) {
//            case valor1:
//                //codigo a ser executado;
//                break;
//            case valor2:
//                //executa outro codigo
//                break;
//            default:
//                //codigo executado se nenhum dos valores for correspondente
//        }

    }
}
