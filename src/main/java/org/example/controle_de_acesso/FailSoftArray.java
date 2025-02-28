package org.example.controle_de_acesso;

public class FailSoftArray {
    private int[] a; // referencia para o array
    private int errval; // valor de erro quando o get falha
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        return index >= 0 && index < length;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return a[index];
        }
        return errval;
    }

}
