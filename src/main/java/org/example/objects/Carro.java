package org.example.objects;

import java.util.Objects;

public class Carro {
    String modelo;
    int ano;

    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "{ \"Carro\": " + "\"" + modelo + "\"," +
                "\"Ano\": " + "\"" + ano + "\"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Carro carro = (Carro) obj;
        return ano == carro.ano && modelo.equals(carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, ano);
    }
}
