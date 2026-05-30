package ListaEColecaoDeDodos.ConstruindoObjetos.ExercicioProduto02.Dominio;

public class Produto {
    private String nome;
    private double precoProduto;
    private int qtdeEstoque;

    public Produto(String nome, double precoProduto, int qtdeEstoque) {
        this.nome = nome;
        this.precoProduto = precoProduto;
        this.qtdeEstoque = qtdeEstoque;
    }

    public Produto(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return "Produto: "+this.nome+ "," + " Preco: " + this.precoProduto + " " + this.qtdeEstoque + " em estoque";
    }
}
