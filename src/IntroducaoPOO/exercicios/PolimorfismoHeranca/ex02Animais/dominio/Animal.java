package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio;

public class Animal {
    private String nomeAnimal;
    private double pessoAnimal;


    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public double getPessoAnimal() {
        return pessoAnimal;
    }

    public void setPessoAnimal(double pessoAnimal) {
        this.pessoAnimal = pessoAnimal;
    }

    public void emitirSom(){
        System.out.println("Som");
    }
}
