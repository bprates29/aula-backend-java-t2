package org.example.heranca;

public class OperacaoBancaria {
    public static final int OP_DEPOSITO = 1;
    public static final int OP_SAQUE = 2;
    public static final int OP_TRANFERENCIA = 3;

    private final int tipoOperacao;
    private double valor;

    public OperacaoBancaria(int tipoOperacao, double valor) {
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public void processar() {
        switch (tipoOperacao){
            case OP_DEPOSITO -> System.out.println("Processando depósito de R$" + valor);
            case OP_SAQUE -> System.out.println("Processando saque de R$" + valor);
            case OP_TRANFERENCIA -> System.out.println("Processando tranferencia de R$" + valor);
            default -> System.out.println("Operação desconhecida!");
        }
    }

    public int getTipoOperacao() {
        return tipoOperacao;
    }

//    public void setTipoOperacao(int op) {
//        this.tipoOperacao = op;
//    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void efetuarPagamento(final double valor, String descricao) {
        //valor = 50.0;

        final String mensagem = "Pagamento processado";
        //mensagem = "Outra mesangem";
    }
}
