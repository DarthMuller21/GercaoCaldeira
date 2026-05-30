package ListaEColecaoDeDodos.ExercicoCopaDOMundo.Dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingCopa {
    private List<Selecao> rankingSelecao;


    public void criarGrupo(){
        this.rankingSelecao = new ArrayList<>();
    }

    public void adicionarSelecao(Selecao selecao) {
        rankingSelecao.add(selecao);
    }

    public void mostrarRanking() {
        Collections.sort(rankingSelecao);

        System.out.println("===== RANKING DA COPA =====");

        for (Selecao selecao : rankingSelecao) {
            System.out.println(selecao);
        }

}}

