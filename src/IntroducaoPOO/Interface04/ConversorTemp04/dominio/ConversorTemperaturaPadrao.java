package IntroducaoPOO.Interface04.ConversorTemp04.dominio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(int grausCelsius) {
        double tempereaturaFahrenheit = 1.8 * grausCelsius +32;
        System.out.println("Temperatura em Fahrenheit "+ tempereaturaFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(int fahrenheit) {
        double temperaturaCelsius = 0.555 * (fahrenheit - 32);
        System.out.println("Temperatura em Celsius "+temperaturaCelsius);
    }
}
