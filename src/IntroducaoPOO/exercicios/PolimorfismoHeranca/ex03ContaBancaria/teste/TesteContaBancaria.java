package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex03ContaBancaria.teste;

import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex03ContaBancaria.dominio.ContaBancaria;
import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex03ContaBancaria.dominio.ContaCorrente;

public class TesteContaBancaria {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaCorrente contaCorrente = new ContaCorrente();

        contaBancaria.depostiar(1000);
        contaBancaria.mostrarSaldo();
        contaBancaria.sacar(500);
        contaBancaria.mostrarSaldo();

        //ContaCorrente
        contaCorrente.depostiar(1000);

        contaCorrente.cobrarTarifaMensal();

    }
}
