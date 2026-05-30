package IntroducaoPOO.Interface04.Calculavel05.teste;

import IntroducaoPOO.Interface04.Calculavel05.dominio.Livro;
import IntroducaoPOO.Interface04.Calculavel05.dominio.Produto;

public class TesteLivroEProduto {
    static void main(String[] args) {
        Livro livro = new Livro();
        livro.setValorLivro(100);
        livro.setDescontoLivro(10);
        System.out.println(livro.calcularPrecoFinal());

        System.out.println("---------------------------");
        Produto produto = new Produto();
        produto.setValorProduto(1000);
        produto.setImpostoProduto(10);
        System.out.println(produto.calcularPrecoFinal());
    }
}
