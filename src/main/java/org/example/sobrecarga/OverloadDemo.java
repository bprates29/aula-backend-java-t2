package org.example.sobrecarga;

public class OverloadDemo {
    void ovlDemo() {
        System.out.println("Sem parâmetro!");
    }

    void ovlDemo(int a) {
        System.out.println("Chamando com um parametro: " + a);
    }

    void ovlDemo(double a) {
        System.out.println("Chamando com um parametro diferente: " + a);
    }

    int ovlDemo(int a, int b) {
        System.out.println("Chamando com dois parametros int: " + a + " b: " + b);
        return a * b;
    }

    double ovlDemo(double a, double b) {
        System.out.println("Chamando com dois parametros double: " + a + " b: " + b);
        return a * b;
    }

}
