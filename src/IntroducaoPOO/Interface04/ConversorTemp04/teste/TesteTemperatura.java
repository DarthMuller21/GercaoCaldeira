package IntroducaoPOO.Interface04.ConversorTemp04.teste;

import IntroducaoPOO.Interface04.ConversorTemp04.dominio.ConversorTemperaturaPadrao;

public class TesteTemperatura {
    static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.fahrenheitParaCelsius(86);
        conversorTemperatura.celsiusParaFahrenheit(30);
    }
}
