package org.example.heranca;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular,
                         double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public final void inicializarRecursosEspeciais() {
        // Lógica critica que não deve ser alterada, herdada...
        System.out.println("Inicializando os processos criticos para as contas...");
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void alterarTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado!");
        } else {
            System.out.println("Valor de deposito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public abstract double calcularTaxaEspecial();
}
