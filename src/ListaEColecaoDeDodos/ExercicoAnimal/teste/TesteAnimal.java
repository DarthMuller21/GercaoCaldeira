package ListaEColecaoDeDodos.ExercicoAnimal.teste;

import ListaEColecaoDeDodos.ExercicoAnimal.Dominio.Animal;
import ListaEColecaoDeDodos.ExercicoAnimal.Dominio.Cachorro;
import ListaEColecaoDeDodos.ScreenMatch.dominio.Titulo;

import java.util.ArrayList;

public class TesteAnimal {
    static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Dog",10, "Pitbul");
        Animal animal = new Animal("Animal Generico", 20);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(cachorro);

        for (Animal animalFor : animals){
            if (animalFor instanceof Cachorro cachorro1){
                System.out.println(cachorro1.getNomeAnimal());
                System.out.println(cachorro1.getRaca());
            }else {
                System.out.println(animalFor.getNomeAnimal());
            }
            System.out.println("*************************");
        }
    }



}
