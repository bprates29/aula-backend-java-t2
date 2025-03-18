package org.example.interfaces;

import org.example.heranca.ContaBancaria;
import org.example.heranca.ContaCorrente;

public class ContaTeste {
    public static void main(String[] args) {
        RegistroAuditoriaSimples rs = new RegistroAuditoriaSimples();
        RegistroAuditoriaCompleta rc = new RegistroAuditoriaCompleta();
        GerenciadorDeContas gc = new GerenciadorDeContas(rs);

        ContaBancaria cb = new ContaCorrente("Bernardo", 15.6, 5.0);
        gc.depositar(cb, 200);
    }
}
