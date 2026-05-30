package ListaEColecaoDeDodos.ScreenMatch.Principal;

import ListaEColecaoDeDodos.ScreenMatch.dominio.Filme;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Serie;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme favorito = new Filme("Matrix", 1999);
        favorito.avalia(10);
        favorito.getClassificacao();
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(6);
        outro.getClassificacao();
        var filmeDoJoao = new Filme("Nemo", 2009);
        filmeDoJoao.avalia(5);
        filmeDoJoao.getClassificacao();
        Serie lost = new Serie("Lost", 2017);

        Filme f1 = filmeDoJoao;

        List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoJoao);
        lista.add(favorito);
        lista.add(outro);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Clasificação " + filme.getClassificacao());
            }
        }

        //ex01 foreach
        for (Titulo item : lista){
            System.out.println(item.getNome());
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Joao");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}