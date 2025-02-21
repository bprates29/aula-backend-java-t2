package org.example.service.paradigma.poo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo (double lar, double altura) {
        largura = lar;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

}
