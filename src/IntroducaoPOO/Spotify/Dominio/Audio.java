package IntroducaoPOO.Spotify.Dominio;

public class Audio{
    protected String Titulo;
    private double duracaoEmMinutos;
    protected int qtdeCurtidas;
    protected int qtdeReproducao;
    private int classificao;
    private double somaClassificao = 0;
    private int qtdeAvaliacoes = 0;
    protected double mediaAvaliacao;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getQtdeCurtidas() {
        return qtdeCurtidas;
    }

    public void setQtdeCurtidas(int qtdeCurtidas) {
        this.qtdeCurtidas = qtdeCurtidas;
    }

    public int getQtdeReproducao() {
        return qtdeReproducao;
    }

    public void setQtdeReproducao(int qtdeReproducao) {
        this.qtdeReproducao = qtdeReproducao;
    }

    public int getClassificao() {
        return classificao;
    }

    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public void avalia(int classificao){
        this.somaClassificao +=classificao;
        this.qtdeAvaliacoes++;
    }

    public void mediaAvaliacao(){
        mediaAvaliacao = this.somaClassificao / this.qtdeAvaliacoes;
        System.out.println("A media das avaliacoes é "+mediaAvaliacao);
    }

}
