package IntroducaoPOO.exercicios.PolimorfismoHeranca.ex03ContaBancaria.dominio;

public class ContaBancaria {
    protected double saldo;
    public String titularConta;
    private int idConta;


    public double getSaldo() {
        return saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double depostiar (double valorHaDepositar){
        return this.saldo += valorHaDepositar;
    }

    public void sacar (double valorHaSacar){
        if (valorHaSacar > this.saldo){
            System.out.println("Saldo insfuciente");
        }else {
            this.saldo -= valorHaSacar;
        }
    }

    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }


}
