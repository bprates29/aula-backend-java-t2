package org.example.service.poo;

public class TestePassagemPorReferencia {
    static void aumentarVelocidade(Carro c) {
        c.velocidade += 20;
        System.out.println("Dentro do método: " + c.velocidade);
    }

    public static void main(String[] args) {
        Carro carro = new Carro(60);
        System.out.println("Anes de chamar o método: " + carro.velocidade);
        aumentarVelocidade(carro);
        System.out.println("Depois do método: " + carro.velocidade);
    }
}
