package org.example.arrays;

public class TwoD {
    public static void main(String[] args) {
        int[][] table = new int[3][4];

        int value = 1;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = value;
                value++;
            }
        }

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

}
