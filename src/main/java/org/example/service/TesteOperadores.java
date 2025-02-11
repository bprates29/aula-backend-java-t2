package org.example.service;

public class TesteOperadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos
        System.out.println("### Operadores Aritméticos ###");
        int a = 10, b = 3;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("Divisão (ponto flutuante): " + (10.0 / 3.0));

        // Operadores de Atribuição
        System.out.println("\n### Operadores de atribuição ###");
        int c = 5;
        System.out.println("Valor incial de c: " + c);
        c += 2; // c = c + 2;
        System.out.println("Apos c: " + c);
        c -= 2; // c = c - 2;
        System.out.println("Apos c: " + c);
        c *= 2; // c = c * 2;
        System.out.println("Apos c: " + c);
        c /= 5; // c = c /5;
        System.out.println("Apos c: " + c);
        c %= 4; // c = c % 4;
        System.out.println("Apos c: " + c);

        System.out.println("\n### Operadores de incremento e decremento ###");
        int x = 5;
        System.out.println("Valor inicial: " + x);
        System.out.println("Pré-incremento: " + (--x)); //
        System.out.println("Pós-incremento: " + (x++)); // x = x + 1
        System.out.println(x);

        System.out.println("\n### Operadores Relacionais ###");
        System.out.println("10 > 5: " + (10 > 5));
        System.out.println("10 < 5: " + (10 < 5));
        System.out.println("10 >= 5: " + (10 >= 5));
        System.out.println("10 <= 5: " + (10 <= 5));
        System.out.println("10 == 5: " + (10 == 5));
        System.out.println("5 != 10: " + (5 != 10));

        System.out.println("\n### Operadores Lógicos ###");
        boolean cond1 = true;
        boolean cond2 = false;
        System.out.println("true && false: " + (cond1 && cond2));
        System.out.println("true || false: " + (cond1 || cond2));
        System.out.println("!true: " + (!cond1));
        System.out.println("true ^ true (XOR): " + (false ^ false));

        System.out.println("\n### Operadores curto-circuito ###");
        int n = 10, d = 0;
        if (d != 0 && (n / d) > 2) {
            System.out.println("Não vai dividir por zero!");
        } else {
            System.out.println("Essa operação foi evitada!");
        }


    }
}
