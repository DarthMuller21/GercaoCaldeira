package ListaEColecaoDeDodos.ExercicoAnimal.Dominio;

public class Animal {
    private String nomeAnimal;
    private int pesoAnimal;



    public Animal (String nome, int peso){
        this.nomeAnimal = nome;
        this.pesoAnimal = peso;
    }

    public void Som(){
        System.out.println("Som");
    }

    public void exibirAnimal(){
        System.out.println(this.nomeAnimal);
        System.out.println(this.pesoAnimal);
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }
}
