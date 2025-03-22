package org.example.arrays;

public class SampleDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];

        for (int i = 0; i < 10; i++) {
            sample[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("sample[" + i + "] = " + sample[i]);
        }
    }
}
