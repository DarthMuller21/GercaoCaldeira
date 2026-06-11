package Map;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    static void main(String[] args) {

        Map<String, Double> alunosNota = new HashMap<>();
        alunosNota.put("Joao", 9.5);
        //pegar valor
        for (Double value : alunosNota.values()){
            System.out.println(value);
        }
        // pegar chave
        for (String chave: alunosNota.keySet()){
            System.out.println(chave);
        }

        //pegar valor e chave
        for (Map.Entry<String, Double> aluno : alunosNota.entrySet()) {
            System.out.println(aluno.getKey() + ": " + aluno.getValue());
        }



    }
}
