import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        double salarioMensal = 1500, comissao, salarioVendedor, valorTotal;
        String nomeVendedor, mes;
        int numeroCarrosVendidos = 0;

        // intanciando o scanner
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula o salario de um vendedor num dado mês------");

        System.out.println("Insira o seu nome: ");
        nomeVendedor = read.nextLine();

        System.out.println("Insira o mês de venda: ");
        mes = read.nextLine();

        System.out.println("Insira o valor total de vendas neste mês: ");
        valorTotal = read.nextDouble();

        System.out.println("Insira o número de carros vendidos: ");
        numeroCarrosVendidos = read.nextInt();

        comissao = (350 * numeroCarrosVendidos) + ((valorTotal * 0.001)/100);

        salarioVendedor = salarioMensal + comissao;

        System.out.printf("DADOS DO VENDEDOR:\n" +
                        "Nome: %s\n" +
                        "Mês das vendas: %s\n" +
                        "Valor total de vendas: %.2f\n" +
                        "N° carros Vendidos: %d\n" +
                        "Comissão Recebida: %f\n" +
                        "Salário total vendedor: %.2f\n", nomeVendedor, mes, valorTotal,
                numeroCarrosVendidos, comissao, salarioVendedor);

    }
}
