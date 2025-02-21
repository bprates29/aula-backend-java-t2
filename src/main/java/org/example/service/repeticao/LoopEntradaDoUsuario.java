package org.example.service.repeticao;

import java.util.Scanner;

public class LoopEntradaDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pedido;

        do {
            System.out.print("Digite o seu pedido e 'sair' para encerrar: ");
            pedido = sc.nextLine();
            if (!pedido.equalsIgnoreCase("sair")) {
                System.out.println("Pedido adicionado: " + pedido);
            }
        } while (!pedido.equalsIgnoreCase("sair"));
    }
}
