package org.example.service.poo;

public class Veiculo {

    public static String TIPO_CARRO = "METAL";

    int passageiros; //Número de passageiros
    int capacidadeCombustivel; // Capacidade do tanque em litros
    int consumo; // Km/l

    Veiculo(int passageiros, int tanque, int consumo) {
        this.passageiros = passageiros;
        capacidadeCombustivel = tanque;
        this.consumo = consumo;
    }

    Veiculo(int passageiros, int tanque) {
        this.passageiros = passageiros;
        capacidadeCombustivel = tanque;
    }

    void autoApresentacao() {
        System.out.println("Veiculo: " + passageiros);
        System.out.println("Veiculo: " + capacidadeCombustivel);
        System.out.println("Veiculo: " + consumo);
    }

    public static void minhaClasse() {
        System.out.println("Metrodo de classe!" + TIPO_CARRO);
    }

    void verificarAutonomia(int autonomia) {
        if (autonomia < 50){
            System.out.println("Atenção! Pouca autonomia");
            return;
        }
        System.out.println("Autonomia suficiente!");
    }

    int calcularAutonomia() {
        return capacidadeCombustivel * consumo;
    }

    int calcularDistanciaPorLitro(int litros) {
        return litros * consumo;
    }

    String verificarCombustivel (double litros) {
        if (litros <= 0) {
            return "Tanque Vazio!";
        } else if (litros < 10) {
            return "Combustivel baixo, melhor abastecer!";
        } else {
            return "Tranque em bom nivel";
        }
    }

}
