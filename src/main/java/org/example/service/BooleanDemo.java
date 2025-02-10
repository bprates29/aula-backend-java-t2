package org.example.service;

public class BooleanDemo {
    public static void main(String[] args) {
        boolean status = true;
        System.out.println("O valor do status é: " + status);

        status = false;
        System.out.println("O valor do status é: " + status);

        if (status) {
            System.out.println("Isso não será impresso.");
        }

        status = true;

        if (status == true) {
            System.out.println("Isso é redundante!");
        }

        System.out.println("10 é maior que 9? " + status);

    }
}
