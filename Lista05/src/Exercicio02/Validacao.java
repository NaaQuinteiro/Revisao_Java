package Exercicio02;

public class Validacao {

    double salarioBruto;

    public Validacao(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public boolean validarSalario(){
        return this.salarioBruto >= 500.0 && this.salarioBruto <= 30000.0;
    }
}
