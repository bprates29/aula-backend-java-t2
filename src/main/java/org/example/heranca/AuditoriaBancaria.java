package org.example.heranca;

public final class AuditoriaBancaria {
    public void registrarOperacao(String descricao) {
        //Lógica de serviço da auditoria
        System.out.println("Operação registrada: " + descricao);
    }
}
