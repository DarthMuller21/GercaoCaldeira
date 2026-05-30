package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau-uuu");
    }

    public void arranharMoveis(){
        System.out.println("rhrhrhrhhrhr moveis arranhando");
    }
}
