package Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double salario = 0, horasExtras = 0;
        double calculoInss = 0, calculoIrpf = 0, calculoPS = 0, calculoHoras = 0, calculoSalaLiqui = 0;
        String dadosObtidos;

        Scanner read = new Scanner(System.in);

        System.out.println("---------Programa para cálculo de descontos do salário---------");


        EntradaSaida entradaSaida = new EntradaSaida();

        salario = entradaSaida.obterSalarioBruto();
        horasExtras = entradaSaida.obterHorasExtras();

        Calculo calculo = new Calculo(salario, horasExtras);

        calculoInss = calculo.descontarINSS();
        calculoIrpf =  calculo.descontarIrfp();
        calculoPS = calculo.descontarPlanoSaude();
        calculoHoras = calculo.acrecentarHorasExtras();
        calculoSalaLiqui = calculo.obterSalarioLiquido(calculoInss, calculoIrpf, calculoPS, calculoHoras);

        dadosObtidos = entradaSaida.mostrarDados(salario, horasExtras, calculoInss, calculoIrpf, calculoPS,
                calculoHoras, calculoSalaLiqui);

        System.out.println(dadosObtidos);

    }
}
