package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex04NumerosPrimos.domino;

public class verificaPrimo extends NumerosPrimos {
        public void verificarSeEhPrimo(int numero) {
            if (verificarPrimalidade(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }

