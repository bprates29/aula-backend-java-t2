package org.example.sobrecarga.construtores;

public class Summation {
    int sum;

    Summation(int n) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    }

    Summation(Summation ob) {
        sum = ob.sum;
    }

    public static void main(String[] args) {
        var s1 = new Summation(5);
        var s2 = new Summation(s1);

        System.out.println("s1: " + s1.sum);
        System.out.println("s2: " + s2.sum);
    }
}
