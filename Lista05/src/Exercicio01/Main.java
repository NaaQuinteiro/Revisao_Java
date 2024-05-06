package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1 = 0, nota2 = 0;
        int escolha = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("---------Programa para cálculo de médias---------");

        System.out.println("Escolha qual média você deseja calcular:\n1 - Média Aritimética\n2 - Média Ponderada");
        escolha = read.nextInt();

        switch (escolha){
            case 1: {
                EntradaSaida entradaSaidaAri = new EntradaSaida();



            }
            case 2: {

            }
            default: {
                System.out.println("Opção inválida, tente novamente.");
            }
        }


    }
}