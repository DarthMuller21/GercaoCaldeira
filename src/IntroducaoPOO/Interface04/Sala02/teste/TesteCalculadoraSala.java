package IntroducaoPOO.Interface04.Sala02.teste;

import IntroducaoPOO.Interface04.Sala02.dominio.CalculadoraSalaRetangular;

public class TesteCalculadoraSala {
    static void main(String[] args) {
        CalculadoraSalaRetangular calculadoraSala = new CalculadoraSalaRetangular();

        calculadoraSala.calcularArea(10,5);
        calculadoraSala.calcularPerimetro(10,5);


    }
}
