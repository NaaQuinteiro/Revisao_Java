package Exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaSaida {
    double salario;
    double valorAEmprestar;

    public EntradaSaida() {
        this.salario =  obterSalarioCliente();
        this.valorAEmprestar = obterEmprestimoCliente();
    }

    Scanner read = new Scanner(System.in);
    Validacao validacao = new Validacao();


    public double obterSalarioCliente(){
        double salario = 0;

        while(true) {
            try {
                System.out.println("Por favor, insira o valor de seu salário: R$");
                salario = read.nextDouble();

                if(salario < 0 ){
                    System.out.println("Valor inválido, insira um número >= 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido,insira um número.");
            }
            read.nextLine();
        }

        return salario;

    }

    double getSalario(){
        return this.salario;
    }

    public double obterEmprestimoCliente() {

        double valorAEmprestar = 0;

        while (true) {
            try {
                System.out.print("Insira qual o valor que você deseja emprestar: R$");
                valorAEmprestar = read.nextDouble();
                if (valorAEmprestar < 0 || !validacao.validarValorEmprestimo(valorAEmprestar)) {
                    System.out.println("Emprestimo inválido, insira um valor entre 0 e R$200.000,00");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido, por favor insira um número.");
            }
            read.nextLine();
        }
        return valorAEmprestar;
    }

    double getValorEmprestar(){
        return this.valorAEmprestar;
    }
}
