package IntroducaoPOO.exercicios.dominio.O2;

public class Aluno04 {
    private String nome;
    private double nota;
    private int totalnotas;
    private double somaNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        totalnotas++;
        somaNotas +=nota;
        this.nota = nota;
    }

    public void calcularMedia (){
         double media = somaNotas / totalnotas;
        System.out.println(media);
    }


}
