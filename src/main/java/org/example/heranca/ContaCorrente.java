package org.example.heranca;

public class ContaCorrente extends ContaBancaria {
    private double taxaOperacao;

    public ContaCorrente(String titular,
                         double saldoInicial,
                         double taxaOperacao) {
        super(titular, saldoInicial);
        this.taxaOperacao = taxaOperacao;
    }

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

    @Override
    public void sacar(double valor) { //100
        var valorTotal = valor + taxaOperacao; //103
        var saldo = super.getSaldo(); //50

        if (valorTotal > 0 && valorTotal <= saldo) {
            super.sacar(valor);
            super.sacar(taxaOperacao);
            System.out.println("Taxa de operação de R$" + taxaOperacao + " foi aplicada!");
            saldo = valorTotal;
        } else {
            System.out.println("Saldo insuficiente ou valor invalido para a conta corrente!");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de operação: R$" + taxaOperacao);
    }

    @Override
    public double calcularTaxaEspecial() {
        if(getSaldo() > 50000) {
            return 10.0;
        }
        return 5.0;
    }

    //Não conseguimos herdar metodos final
//    @Override
//    public final void inicializarRecursosEspeciais() {
//
//    }
}
