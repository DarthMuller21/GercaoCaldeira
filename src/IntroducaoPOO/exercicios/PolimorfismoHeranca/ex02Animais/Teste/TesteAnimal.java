package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.Teste;

import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio.Animal;
import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio.Cachorro;
import IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio.Gato;

public class TesteAnimal {
    static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro golden = new Cachorro();
        Gato mark = new Gato();

        golden.emitirSom();
        golden.abanarRabo();
        mark.setNomeAnimal("joao");
        mark.emitirSom();
        mark.arranharMoveis();
    }
}
