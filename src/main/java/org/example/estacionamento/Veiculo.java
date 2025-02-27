package org.example.estacionamento;

public class Veiculo {
    String placa;
    String modelo;
    long horaEntrada; // Armazena em milisegundos

    public Veiculo(String placa, String modelo, long horaEntrada) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }

    public long calcularTempoEstacionado() {
        long horaSaida = System.currentTimeMillis();
        return (horaSaida - this.horaEntrada) / (1000 * 60 * 60);
    }
}
