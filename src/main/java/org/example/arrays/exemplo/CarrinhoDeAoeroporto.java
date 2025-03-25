package org.example.arrays.exemplo;

public class CarrinhoDeAoeroporto {
    public static void main(String[] args) {
        int[][] carrinho = new int[7][];

        for (int i = 0; i < 5; i++) {
            carrinho[i] = new int[10];
        }

        carrinho[5] = new int[2];
        carrinho[6] = new int[2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                carrinho[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int j = 0; j < 2; j++) {
            carrinho[5][j] = 100 + j;
            carrinho[6][j] = 200 + j;
        }

        for (int i = 0; i < carrinho.length; i++) {
            System.out.print("Dia " + i + ": ");
            for (int j = 0; j < carrinho[i].length; j++) {
                System.out.print(carrinho[i][j] + " ");
            }
            System.out.println();
        }
    }
}
