package org.example.interfaces;

public interface RegistroAuditoria {

    int COD_OPERACAO_AUDITORIA = 999;

    void registrarDeposito(double valor);
    void registrarSaque(double valor);
    void registrarTransferencia(double valor, String contaDestino);
}
