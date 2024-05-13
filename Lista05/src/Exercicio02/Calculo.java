package Exercicio02;

public class Calculo {
    final Double valorInss = 20.0;
    final Double valorIrpf = 10.0;
    final Double valorPlanoSaude = 5.0;

    double salario;
    double horasExtras;


    // Construtor
    public Calculo(double salarioBruto, double horasExtras) {
        this.salario = salarioBruto;
        this.horasExtras = horasExtras;
    }



    // Retorna o salario com o desconto do inss
    public double descontarINSS(){
        return (this.salario*(valorInss/100));
    }

    //Retorna o salario com o desconto do irfp
    public double descontarIrfp(){
        return (this.salario*(valorIrpf/100));
    }

    //Retorna o salario com o desconto do Plano de saude
    public double descontarPlanoSaude(){
        return  (this.salario*(valorPlanoSaude/100));
    }

    //Retorna o salario com o valor das horas extras extras acrecentadas
    public double acrecentarHorasExtras(){
        double horaNormal = this.salario/160;
        double totalHoraExtra = this.horasExtras*(horaNormal*(50.0/100));

        return (this.salario + totalHoraExtra);
    }

    //Retorna o salário liquido
    public double obterSalarioLiquido( double descontoInss, double descontoIrfp,
                                       double descontoPlano, double valorHorasExtras){

        return (this.salario - descontoInss - descontoIrfp - descontoPlano) + valorHorasExtras;
    }





}
