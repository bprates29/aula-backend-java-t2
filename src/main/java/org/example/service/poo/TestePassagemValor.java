package org.example.service.poo;

public class TestePassagemValor {
    static int dobrarValor(int num) {
        num = num * 2;
        System.out.println("Dentro do método: " + num);
        return num;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Antes de chamar o método: " + num);
        num = dobrarValor(num);
        System.out.println("Depois de chamar o método: " + num);
    }

}
