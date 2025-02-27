package org.example.objects;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", 1970);
        Carro carro2 = new Carro("Civic", 2020);
        Carro carro3 = new Carro("Fusca", 1970);

        carro1.toString();
        carro1.hashCode();
        carro1.getClass();


        System.out.println("equals: " + carro1.equals(carro3));

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
    }
}
