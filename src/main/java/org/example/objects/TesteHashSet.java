package org.example.objects;

import java.util.HashSet;

public class TesteHashSet {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", 1970);
        Carro carro2 = new Carro("Civic", 2020);
        Carro carro3 = new Carro("Fusca", 1970);

        HashSet<Carro> carros = new HashSet<>();

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        System.out.println("Numero de carros na coleção: " + carros.size());
    }
}
