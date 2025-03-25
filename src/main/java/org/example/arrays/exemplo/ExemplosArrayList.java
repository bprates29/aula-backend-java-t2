package org.example.arrays.exemplo;

import java.util.ArrayList;
import java.util.List;

public class ExemplosArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Carlos");
        System.out.println(nomes);

        nomes.add(1, "Ana");
        System.out.println(nomes);

        System.out.println(nomes.get(3));
        System.out.println(nomes.size());

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.forEach(System.out::println);

        nomes.remove(2);
        nomes.remove("Carlos");
        System.out.println(nomes);

        nomes.set(1, "Ana Alguma Coisa");

        System.out.println(nomes);
    }
}
