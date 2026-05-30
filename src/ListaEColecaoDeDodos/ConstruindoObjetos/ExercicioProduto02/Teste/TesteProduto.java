package ListaEColecaoDeDodos.ConstruindoObjetos.ExercicioProduto02.Teste;

import ListaEColecaoDeDodos.ConstruindoObjetos.ExercicioProduto02.Dominio.Produto;
import ListaEColecaoDeDodos.ConstruindoObjetos.ExercicioProduto02.Dominio.ProdutoPerecivel;

import java.util.ArrayList;

public class TesteProduto {
    static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        var produto1 = new Produto();
        var produto2 = new Produto();
        var produto3 = new Produto();
        produto1.setNome("Arroz");
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        //ex01
        System.out.println("Tamanho lista "+produtos.size());
        System.out.println("Produto 01 "+produtos.getFirst().getNome());

        //ex02
        System.out.println(produtos.toString());

        //ex03 Com construtores
        var produtosConstrutores = new ArrayList<Produto>();
        var produto01 = new Produto("Macarrao", 5, 100);
        var produto02 = new Produto("Sabor Energetico", 25, 67);
        var produto03 = new Produto("Coca-Cola", 10, 200);

        produtosConstrutores.add(produto01);
        produtosConstrutores.add(produto02);
        produtosConstrutores.add(produto03);
        System.out.println(produtosConstrutores.toString());

        //ex04
        var produtoPerecivel = new ProdutoPerecivel("Pao",2,150,"05-21-2026");
        produtosConstrutores.add(produtoPerecivel);
        System.out.println(produtosConstrutores.getLast().toString());


    }
}
