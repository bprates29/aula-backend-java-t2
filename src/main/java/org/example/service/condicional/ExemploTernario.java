package org.example.service.condicional;

import java.util.Scanner;

public class ExemploTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        // Usando if-else
        String categoria;
        if (idade >= 18) {
            categoria = "Adulto";
        } else {
            categoria = "Menor de idade";
        }
        System.out.println("Categoria: " + categoria);

        // Usando operador ternário
        String categoriaTernario = idade >= 18 ? "Adulto" : "Menor de idade";
        System.out.println("Categoria (ternário): " + categoriaTernario);

        var outro = categoriaTernario;
    }
}
