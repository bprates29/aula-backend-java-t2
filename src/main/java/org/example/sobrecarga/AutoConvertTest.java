package org.example.sobrecarga;

public class AutoConvertTest {
    public static void main(String[] args) {
        AutoConvertOverload ac = new AutoConvertOverload();

        byte b = 10;
        short s = 20;
        float f = 3.12F;
        int i = 300;

        ac.f(b);
        ac.f(s);
        ac.f(f);
        ac.f(i);

    }
}
