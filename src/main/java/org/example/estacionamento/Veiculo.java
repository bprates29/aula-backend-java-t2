package org.example.estacionamento;

public class Veiculo {
    private String placa;
    private String modelo;
    private long horaEntrada; // Armazena em milisegundos

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = System.currentTimeMillis();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.isBlank()) {
            return;
        }
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.isBlank()) {
            return;
        }
        this.modelo = modelo;
    }

    public long calcularTempoEstacionado() {
        long miliSegundosDeSaida = System.currentTimeMillis();
        long miliSegundosDePermanencia = miliSegundosDeSaida - this.horaEntrada;
        return converterParaHora(miliSegundosDePermanencia);
    }

    private long converterParaHora(long hora) {
        return hora / 1000L * 60L * 60L;
    }

    public boolean isPlacaEqual(String placa) {
        return this.placa.equalsIgnoreCase(placa);
    }
}
