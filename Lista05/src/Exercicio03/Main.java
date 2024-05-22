package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double  valorAEmprestar = 0, valorParcelas = 0;

        System.out.println("---------Programa para cálculo e validação de empréstimo---------");

        EntradaSaida entradaSaida = new EntradaSaida();

        Calculo calculo = new Calculo(entradaSaida.getSalario(), entradaSaida.getValorEmprestar());

        valorParcelas = calculo.calcularParcelas(calculo.calcularTotalASerPago());

        Validacao validacao = new Validacao();

        if (validacao.validarEmprestimo(entradaSaida.getSalario(), valorParcelas)){
            System.out.println("------Não é possível realizar o empréstimo!------\n" +
                    "O valor das parcelas ultrapassa 15% do valor de seu salário.");
        }else{
            System.out.printf("------Empréstimo aprovado!------\n" +
                            "Valor das parcelas: R$%.2f\n" +
                            "Valor Total: R$%.2f", valorParcelas, calculo.calcularTotalASerPago());
        }

    }
}
