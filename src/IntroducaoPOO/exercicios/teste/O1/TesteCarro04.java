package IntroducaoPOO.exercicios.teste.O1;

import IntroducaoPOO.exercicios.dominio.O1.Carro04;

public class TesteCarro04 {
    static void main(String[] args) {
        Carro04 carro = new Carro04();

        carro.modelo = "Corola";
        carro.ano =2000;
        carro.cor = "Azul bebe";

        carro.fichaTecnica();
        System.out.println(carro.idade());

    }
}
