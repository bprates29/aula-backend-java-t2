package org.example.heranca;

public class ContaCorrenteEspecial extends ContaCorrente {
    private double limiteExtra;

    public ContaCorrenteEspecial(String titular,
                                 double saldoInicial,
                                 double taxaOperacao,
                                 double limiteExtra) {
        super(titular, saldoInicial, taxaOperacao);
        this.limiteExtra = limiteExtra;
    }

    @Override
    public void sacar(double valor) { //100
        double valorDisponivel = getSaldo() + limiteExtra; //50 + 100
        double valorTotal = valor + getTaxaOperacao(); //103
        double novoSaldo = valorDisponivel - valorTotal;

        if (valorTotal <= valorDisponivel && valorTotal > 0) {
            super.setSaldo(novoSaldo);
            System.out.println("Limite extra utilizado, caso necessário!");
        } else {
            System.out.println("Saldo + limite insuficiente!");
        }
    }
}
