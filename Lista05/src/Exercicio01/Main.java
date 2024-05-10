package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha = 0;
        double nota1 = 0, nota2 =0, aritimetica;
        double peso1 = 0, peso2 =0, ponderada;
        String statusAprovacao;

        Scanner read = new Scanner(System.in);

        System.out.println("---------Programa para cálculo de médias---------");

        System.out.println("Escolha qual média você deseja calcular:\n1 - Média Aritimética\n2 - Média Ponderada");
        escolha = read.nextInt();

        //Instancia das classes
        EntradaSaida entradaSaida = new EntradaSaida();
        Calculo calculo = new Calculo();
        Resultado resultado = new Resultado();

        // Desenvolvimento da logica
        switch (escolha){
            case 1: {

                 nota1 = entradaSaida.entradaDeNotas(1);
                 nota2 = entradaSaida.entradaDeNotas(2);

                 aritimetica = calculo.calcularAritimetica(nota1, nota2);

                 statusAprovacao = resultado.verificarAprovacao(aritimetica);

                System.out.println("----------------------------------------------");
                 System.out.printf("Média Aritmética: %.2f\nStatus de Aprovovação: %s",
                        aritimetica, statusAprovacao);

                 break;
            }
            case 2: {
                nota1 = entradaSaida.entradaDeNotas(1);
                peso1 = entradaSaida.entradaDePeso(1);
                nota2 = entradaSaida.entradaDeNotas(2);
                peso2 = entradaSaida.entradaDePeso(2);

                ponderada = calculo.calcularPonderada(nota1, nota2, peso1, peso2);

                statusAprovacao = resultado.verificarAprovacao(ponderada);

                System.out.println("----------------------------------------------");
                System.out.printf("Média Ponderada: %.2f\nStatus de Aprovovação: %s",
                        ponderada, statusAprovacao);

                break;
            }
            default: {
                System.out.println("Opção inválida, tente novamente.");
            }
        }


    }
}