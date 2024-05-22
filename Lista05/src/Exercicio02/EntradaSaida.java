package Exercicio02;

import java.util.Scanner;

public class EntradaSaida {

    double salarioBruto;
    double horasExtras;

    public EntradaSaida() {
        this.salarioBruto = obterSalarioBruto();
        this.horasExtras = obterHorasExtras();

    }
    Scanner read = new Scanner(System.in);
    public double obterSalarioBruto() {

        double salarioBruto = 0;

        Validacao validacao;
        do {
            System.out.println("Por favor insira o valor do seu salário bruto: ");
            salarioBruto = read.nextDouble();
            validacao = new Validacao(salarioBruto);

            if (!validacao.validarSalario()) {
                System.out.println("Valor Inválido, tente novamente!");
                continue;
            }
        } while (!validacao.validarSalario());

        return salarioBruto;

    }

    // metodo que mostra apenas o salario bruto
    double getSalarioBruto(){
        return this.salarioBruto;
    }

    public double obterHorasExtras(){
        double horasExtras = 0;

        System.out.println("Por favor insira o total suas Horas Extras: ");
        horasExtras =  read.nextDouble();

        return horasExtras;

    }

    double getHorasExtras(){
        return this.horasExtras;
    }


    public String mostrarDados(double salario, double horaExtra, double calculoInss,
                               double calculoIrpf, double calculoPS, double calculoHoras, double calculoSalaLiqui){

        return String.format("\n----------DADOS OBTIDOS DO USUÁRIO----------" +
                "\nSalário Bruto: R$ %.2f" +
                "\nHoras Extras: %.0fh" +
                "\nDesconto de INSS: R$ %.2f" +
                "\nDesconto de IRPF: R$ %.2f" +
                "\nDesconto de Plano de Saúde: R$ %.2f" +
                "\nAcréscimo de horas Extras: R$ %.2f" +
                "\nSalário Líquido: R$ %.2f", salario, horaExtra, calculoInss, calculoIrpf, calculoPS, calculoHoras,
                calculoSalaLiqui);
    };


}
