package ListaEColecaoDeDodos.ScreenMatch.teste;

import ListaEColecaoDeDodos.ScreenMatch.calculo.CalculadoraTempo;
import ListaEColecaoDeDodos.ScreenMatch.calculo.FiltroRecomendacao;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Episodio;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Filme;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Serie;

import java.util.ArrayList;

public class TesteScreenMatch {
    public static void main(String[] args) {
        Filme favorito = new Filme("Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(10);


        Filme outro = new Filme("John Wick", 2014);
        //outro.setNome("John Wick");
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie lost = new Serie("Lost", 2017);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2017);
        lost.setIncluidoNoPlano(true);
        lost.setAtiva(true);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(lost);

        System.out.println("Tempo total: "+calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDoJoao = new Filme("Nemo",2009);
        //filmeDoJoao.setNome("Nemo");
        filmeDoJoao.setDuracaoEmMinutos(200);
        filmeDoJoao.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoJoao);
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);
        System.out.println("Tamanho lista "+listaDeFilmes.size());
        System.out.println("Priemiro Filme "+ listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes.getFirst().toString());
        System.out.println(listaDeFilmes.get(1).toString());
        System.out.println(listaDeFilmes.getLast().toString());



    }
}
