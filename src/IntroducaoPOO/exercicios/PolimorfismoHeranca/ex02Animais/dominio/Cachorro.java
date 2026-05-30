package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex02Animais.dominio;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("AU-AU");
    }

    public void abanarRabo (){
        System.out.println("Rabo abanado");
    }

}
