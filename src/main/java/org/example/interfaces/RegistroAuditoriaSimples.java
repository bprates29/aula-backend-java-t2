package org.example.interfaces;

public class RegistroAuditoriaSimples implements RegistroAuditoria {
    @Override
    public void registrarDeposito(double valor) {
        System.out.println("Registrando Depósito de R$ " + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarSaque(double valor) {
        System.out.println("Registrando Saque de R$ " + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarTransferencia(double valor, String contaDestino) {
        System.out.println("Registrando Tranferência de R$ " + valor +
                " para conta: " + contaDestino +
                "COD: " + COD_OPERACAO_AUDITORIA);
    }
}
