package IntroducaoPOO.exercicios.dominio.O1;

public class Carro04 {
    public String modelo;
    public int ano;
    public String cor;

    public void fichaTecnica(){
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.cor);
    }

    public int idade(){
        return 2026 -this.ano;
    }

}
