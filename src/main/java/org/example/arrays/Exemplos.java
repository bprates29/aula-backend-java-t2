package org.example.arrays;

import java.util.ArrayList;

public class Exemplos {
    public static void main(String[] args) {
        //exemploTemperatura();
        //exemploSaldos();
//        int[] sample;
//        sample = new int[10];

        int[][] table = new int[10][20];

        //sample[0] .. sample[9];
    }

    private static void exemploSaldos() {
        double[] saldos = {1000.0, 2500.05, 320.75, 10000.45, 500.0};

        for (double saldo : saldos) {
            if (saldo > 1000) {
                System.out.println("Saldo acima de mil: R$ " + saldo);
            }
        }
    }

    private static void exemploTemperatura() {
        double[] temperaturas = new double[30];

        temperaturas[0] = 23.4;
        temperaturas[1] = 33.5;
        temperaturas[2] = 26.2;
        temperaturas[3] = 13.8;
        //...

        double soma = 0;
        for (int i = 0; i< temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;
        System.out.println("Médias das temperaturas: " + media);
    }
}
