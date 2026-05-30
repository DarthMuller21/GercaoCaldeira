package IntroducaoPOO.Interface04.ConversaoFinanceira01.domino;

public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public void converterDolarParaReal(double valorDolar, double valorHaConverter) {
       double valorRealConversao = valorDolar * valorHaConverter;
        System.out.println("Valor da conversao em Reais é R$"+valorRealConversao);
    }
}
