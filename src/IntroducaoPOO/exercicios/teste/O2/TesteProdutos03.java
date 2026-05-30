package IntroducaoPOO.exercicios.teste.O2;

import IntroducaoPOO.exercicios.dominio.O2.Produtos03;

public class TesteProdutos03 {
    static void main(String[] args) {
        Produtos03 produto = new Produtos03();

        produto.setNomeProduto("PS5");
        produto.setValorProduto(100);

        String nomeProduto = produto.getNomeProduto();
        double valorProduto = produto.getValorProduto();

        produto.aplicarDesconto(10);

    }
}
