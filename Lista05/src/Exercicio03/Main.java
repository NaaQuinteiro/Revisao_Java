package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salario = 0, valorAEmprestar = 0, valorParcelas = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("---------Programa para cálculo e validação de empréstimo---------");

        EntradaSaida entradaSaida = new EntradaSaida();

        salario = entradaSaida.obterSalarioCliente();
        valorAEmprestar = entradaSaida.obterEmprestimoCliente();

        Calculo calculo = new Calculo(salario, valorAEmprestar);

        valorParcelas = calculo.calcularParcelas(calculo.calcularTotalASerPago());

        Validacao validacao = new Validacao();

        if (validacao.validarEmprestimo(salario, valorParcelas)){
            System.out.println("------Não é possível realizar o empréstimo!------\n" +
                    "O valor das parcelas ultrapassa 15% do valor de seu salário.");
        }else{
            System.out.printf("------Empréstimo aprovado!------\n" +
                            "Valor das parcelas: R$%.2f\n" +
                            "Valor Total: R$%.2f", valorParcelas, calculo.calcularTotalASerPago());
        }

    }
}
