package org.example.service.paradigma.poo;

import java.util.Scanner;

public class ProgramaInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Digite a largura");
        double largura = sc.nextDouble();

        System.out.println("Digite a altura");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Área do retangulo: " + retangulo.calcularArea());
    }
}
