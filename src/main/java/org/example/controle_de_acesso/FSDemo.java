package org.example.controle_de_acesso;

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);

        System.out.println("Tamanho do array: " + fs.length);

        //Preencher o array
        for (int i = 0; i < fs.length * 2; i++) {
            var valor = i*7;
            if(fs.put(i, valor)) {
                System.out.println("Valor " + valor + " adicionada na posição " + i);
            } else {
                System.out.println("Erro ao inserir valor " + valor + " na posição " + i);
            }
        }

        for (int i = 0; i < fs.length * 2; i++) {
            var valor = fs.get(i);
            if(valor != -1) {
                System.out.println("fs[" + i + "] = " + valor);
            } else {
                System.out.println("Erro ao ler indice " + i);
            }
        }
    }
}
