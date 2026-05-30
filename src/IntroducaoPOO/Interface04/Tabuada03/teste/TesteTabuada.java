package IntroducaoPOO.Interface04.Tabuada03.teste;

import IntroducaoPOO.Interface04.Tabuada03.dominio.MultiplicacaoTabuada;
import IntroducaoPOO.Interface04.Tabuada03.dominio.Tabuada;

public class TesteTabuada {
    static void main(String[] args) {
        MultiplicacaoTabuada tabuada = new MultiplicacaoTabuada();
        tabuada.mostrarTabuada(5);
    }
}
