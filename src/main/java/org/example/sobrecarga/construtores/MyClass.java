package org.example.sobrecarga.construtores;

public class MyClass {
    int x;

    MyClass() {
        x = 0;
        System.out.println("Construtor sem parametro!");
    }

    MyClass(int a) {
        x = a;
        System.out.println("Construtor com um parametro: " + a);
    }

    MyClass(int a, int e) {
        x = a+e;
        System.out.println("Construtor com dois parametro: " + a+ ". e:" +e);
    }

    MyClass(MyClass mc) {
        x = mc.x;
        System.out.println("Construtor com o objeto como parametro: " + mc.x);
    }

    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass(10);
        MyClass mc3 = new MyClass(3, 5);
        MyClass mc4 = new MyClass(mc2);
    }
}
