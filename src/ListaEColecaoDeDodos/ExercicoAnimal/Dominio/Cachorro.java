package ListaEColecaoDeDodos.ExercicoAnimal.Dominio;

public class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, int peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public void Som() {
        System.out.println("Au-Au");
    }

    @Override
    public void exibirAnimal() {
        super.exibirAnimal();
        System.out.println(this.raca);
    }

    public String getRaca() {
        return raca;
    }
}
