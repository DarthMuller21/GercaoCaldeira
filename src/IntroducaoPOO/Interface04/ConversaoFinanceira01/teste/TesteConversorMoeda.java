package IntroducaoPOO.Interface04.ConversaoFinanceira01.teste;

import IntroducaoPOO.Interface04.ConversaoFinanceira01.domino.ConversorMoeda;

public class TesteConversorMoeda {
    static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        conversorMoeda.converterDolarParaReal(5.09,100);
    }
}
