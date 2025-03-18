package org.example.interfaces;

import org.example.heranca.ContaBancaria;

public class GerenciadorDeContas {
    private RegistroAuditoria auditoria;

    public GerenciadorDeContas(RegistroAuditoria auditoria) {
        this.auditoria = auditoria;
    }

    public void depositar (ContaBancaria conta, double valor) {
        conta.depositar(valor);
        auditoria.registrarDeposito(valor);
    }
}
