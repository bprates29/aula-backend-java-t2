package org.example.service.paradigma.estrutural;

import java.util.Scanner;

public class Retangulo {

    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Digite a largura");
        double largura = sc.nextDouble();

        System.out.println("Digite a altura");
        double altura = sc.nextDouble();

        double area = calcularArea(largura, altura);

        System.out.println("Área do retangulo: " + area);
    }
}
