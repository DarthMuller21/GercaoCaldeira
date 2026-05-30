package DesafiosPoo.Rpg.teste;

import DesafiosPoo.Rpg.dominio.Monstros;

public class TesteMonstros {
    static void main(String[] args) {
        Monstros monstro1 = new Monstros();

        monstro1.setNomeMosntro("Grogu");
        monstro1.setTipoMonstro("Jedi");
        monstro1.setVida(100);
        monstro1.setDefesa(10);
        monstro1.setAtaque(50);

        Monstros monstro2 = new Monstros();
        monstro2.setNomeMosntro("Darth Sidius");
        monstro2.setTipoMonstro("Sith");
        monstro2.setVida(100);
        monstro2.setDefesa(20);


        //atacar
        monstro1.MonstroHaatacar(monstro2);



        System.out.println("*******************************");
        //Receber dano
        monstro1.ReceberDano(50);
        //monstro1.ReceberDano(70);
        System.out.println("*******************************");
        //exibir ficha do monstro
        monstro1.ExibirFichaTecnica();
        System.out.println("****************************************");
        //exibir status
        monstro1.ExibirStatus();



    }
}
