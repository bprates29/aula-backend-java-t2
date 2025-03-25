package org.example.arrays.exemplo;

public class SqrTable {
    public static void main(String[] args) {
        int[][] sqrs = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100, 200}
        };

        for (int i = 0; i < sqrs.length; i++) {
            System.out.println(sqrs[i].length);
            System.out.println("Numero: " + sqrs[i][0] +
                    ", Quadrado: " + sqrs[i][1]);
        }
    }
}
