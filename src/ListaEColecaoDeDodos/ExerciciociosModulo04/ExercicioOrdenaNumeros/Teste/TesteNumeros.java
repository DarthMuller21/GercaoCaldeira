package ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioOrdenaNumeros.Teste;

import ListaEColecaoDeDodos.ExerciciociosModulo04.ExercicioOrdenaNumeros.Dominio.Numeros;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteNumeros {
    static void main(String[] args) {
        var num1 = new Numeros(1);
        var num2 = new Numeros(5);
        var num3 = new Numeros(10);

        List<Numeros> numeros = new LinkedList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        Collections.sort(numeros);
        System.out.println(numeros);

//        List<String> testeNomes = new LinkedList<>();
//        testeNomes.add("Joao");
//        testeNomes.add("Arthut");
//        testeNomes.add("Miguel");
//        Collections.sort(testeNomes);
//        System.out.println(testeNomes);
    }
}
