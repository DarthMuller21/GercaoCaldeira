package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex04NumerosPrimos.teste;

import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex04NumerosPrimos.domino.GeradorPrimo;
import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex04NumerosPrimos.domino.NumerosPrimos;
import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex04NumerosPrimos.domino.verificaPrimo;

public class TesteNumerosPrimos {
     static void main(String[] args) {
        verificaPrimo verificador = new verificaPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
