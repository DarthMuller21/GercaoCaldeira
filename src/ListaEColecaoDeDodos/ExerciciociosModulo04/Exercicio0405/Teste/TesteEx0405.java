package ListaEColecaoDeDodos.ExerciciociosModulo04.Exercicio0405.Teste;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteEx0405 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Julia");
        nomes.add("Ana");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("*******************************");
        // LinkedList
        List<String> selecoesCopa = new LinkedList<>();
        selecoesCopa.add("Brasil");
        selecoesCopa.add("Cabo verde");
        selecoesCopa.add("Argentina");
        Collections.sort(selecoesCopa);
        System.out.println(selecoesCopa);


        //ex05

        List<String>listPolimorfismo = new LinkedList<>();
        listPolimorfismo.add("Elemento 1");
        listPolimorfismo.add("Elemento 2");
        System.out.println("LikedList "+listPolimorfismo);

        System.out.println("******************************");
        listPolimorfismo = new ArrayList<>();
        listPolimorfismo.add("Elemento A");
        listPolimorfismo.add("Elemento B");
        System.out.println("ArrayList "+listPolimorfismo);
    }
}
