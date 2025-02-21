package org.example.service.poo;

public class TesteVeiculo {
    static void aumentarCapacidadeCombustivel(Veiculo veiculo) {
        veiculo.capacidadeCombustivel += 20;
        System.out.println("Dentro do método: " + veiculo.capacidadeCombustivel);
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo(3, 51, 14);
        System.out.println("Antes do método: " + carro1.capacidadeCombustivel);
        aumentarCapacidadeCombustivel(carro1);
        System.out.println("Depois de cchamar o método: " + carro1.capacidadeCombustivel);


        Veiculo.minhaClasse();


        Veiculo carro2 = new Veiculo(2, 35, 20);

        carro1.autoApresentacao();
        carro2.autoApresentacao();

        int autonomia = carro1.calcularAutonomia();
        System.out.println(autonomia);

        var litrosDisponiveis = 20;
        int distancia = carro1.calcularDistanciaPorLitro(litrosDisponiveis);
        System.out.println("Com " + litrosDisponiveis + " litros, o carro percorre " + distancia + " km.");

    }
}
