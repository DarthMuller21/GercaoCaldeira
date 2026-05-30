package IntroducaoPOO.exercicios.dominio.O1;

public class Musica03 {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numAvaliacao;
    public double somaAvaliacao;

    public void fichaTecnica(){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.anoLancamento);
        System.out.println(this.avaliacao);
        System.out.println(this.numAvaliacao);
    }

    public void SomaAvaliacao (double nota){
        somaAvaliacao +=nota;
        numAvaliacao++;
    }

    public double mediaAvalia(){
        return somaAvaliacao / numAvaliacao;
    }
}
