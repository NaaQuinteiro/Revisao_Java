package Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double salario = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("---------Programa para cálculo de descontos do salário---------");

        EntradaSaida entradaSaida = new EntradaSaida();

        salario = entradaSaida.obterSalarioBruto();


    }
}
