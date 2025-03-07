package org.example.heranca;

public class BencoDemo {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
        cc.exibirInformacoes();
        cc.sacar(100.0);
        cc.exibirInformacoes();

        System.out.println("=========================");
        ContaPoupanca cp = new ContaPoupanca("José", 500.0, 2.5);
        cp.exibirInformacoes();
        cp.aplicarRendimento();
        cp.exibirInformacoes();
        cp.sacar(100.0);
        cp.exibirInformacoes();
    }
}
