package Exercicio03;

public class Calculo {

    final Double PeriodoDeTempo = 24.0;
    final Double TotalDeJuros = 0.35;


    double salario;
    double valorAEmprestar;



    public Calculo(double salario, double valorAEmprestar) {
        this.salario = salario;
        this.valorAEmprestar = valorAEmprestar;
    }

    public double calcularTotalASerPago(){
        
        double taxaJuros = (this.valorAEmprestar * this.TotalDeJuros);

        return (this.valorAEmprestar + taxaJuros);
        
    }

    public double calcularParcelas(double totalPagar){

        return (totalPagar /this.PeriodoDeTempo);
    }
    
}
