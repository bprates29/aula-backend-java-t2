package org.example.try_arquivos;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExemplosTry {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inicio do nosso programa!");
        int resultado = 10 / 2;
        System.out.println("Meio do nosso programa resultado: " + resultado);

        //extracted();
        try {
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            System.out.println("Voce digitou o numero: " + numero);
        } catch (InputMismatchException ex) {
            System.out.println("Erro: indice inválido!");
        } catch (NoSuchElementException ex) {
            System.out.println("Erro:Não há elemento para mostrar!");
        } catch (Exception e) {
            System.out.println("Erro: generico");
        } finally {
            System.out.println("Conexão encerrada");
        }

        // ...
        System.out.println("Fim do programa, resultado: " + resultado);
    }

    private static void extracted() {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println("Resultado array: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: indice inválido!");
        } finally {
            System.out.println("Conexão encerrada");
        }
    }
}
