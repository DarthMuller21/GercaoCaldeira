package ListaEColecaoDeDodos.ConstruindoObjetos.ExercicioProduto02.Dominio;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double precoProduto, int qtdeEstoque, String dataValidade) {
        super(nome, precoProduto, qtdeEstoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " Data de validade "+ this.dataValidade;
    }
}
