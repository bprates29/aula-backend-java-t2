package org.example.service;

import org.w3c.dom.ls.LSOutput;

public class CharDemo {
    public static void main(String[] args) {
        char ch = 'X';
        System.out.println("O valor de ch é: " + ch);

        ch++;
        System.out.println("O valor de ch é: " + ch);

        ch = 90;
        System.out.println("O valor de ch é: " + ch);

        for (int i = 0; i < 500; i++) {
            System.out.println(i + " = " + (char)i);
        }

    }


}
