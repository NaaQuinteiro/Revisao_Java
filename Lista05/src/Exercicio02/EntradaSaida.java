package Exercicio02;

import java.util.Scanner;

public class EntradaSaida {
    public EntradaSaida() {

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

//    public String mostrarDados(){
//
//
//    };


}
