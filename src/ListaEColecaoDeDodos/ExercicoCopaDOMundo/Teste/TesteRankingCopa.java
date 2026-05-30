package ListaEColecaoDeDodos.ExercicoCopaDOMundo.Teste;

import ListaEColecaoDeDodos.ExercicoCopaDOMundo.Dominio.RankingCopa;
import ListaEColecaoDeDodos.ExercicoCopaDOMundo.Dominio.Selecao;

import java.util.ArrayList;

public class TesteRankingCopa {
    static void main(String[] args) {
        var rankingCopa = new RankingCopa();
        var Argentina = new Selecao("Argentina", 10, 15);
        var Brasil = new Selecao("Brasil", 12, 23);
        var CaboVerde = new Selecao("Cabo Verde", 11, 5);

         rankingCopa.criarGrupo();
         rankingCopa.adicionarSelecao(Argentina);
         rankingCopa.adicionarSelecao(Brasil);
         rankingCopa.adicionarSelecao(CaboVerde);
         rankingCopa.mostrarRanking();

    }
}
