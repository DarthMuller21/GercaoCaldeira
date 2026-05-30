package IntroducaoPOO.exercicios.dominio.O2;

public class Livro05 {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
    }
}
