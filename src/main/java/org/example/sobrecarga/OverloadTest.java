package org.example.sobrecarga;

public class OverloadTest {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();

        od.ovlDemo();
        od.ovlDemo(10);
        var restI = od.ovlDemo(10, 30);
        System.out.println("Resultado inteiro: " + restI);

        var restD = od.ovlDemo(10.4, 2.5);
        System.out.println("Resultado double: " + restD);

    }
}
