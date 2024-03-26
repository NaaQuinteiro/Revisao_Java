import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        double valorDeCompra = 0, valorDeVenda, porcentagemRepresentante, porcentacemDeImposto;

        // instanciando o scanner de leitura
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula o calor de venda de uma mercadoria------");

        // enquanto não for inserido um numero valido o usuário tem que tentar novamente.
        do{
            try{
                System.out.println("Insira o valor de compra do produto: ");
                valorDeCompra = read.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("ERRO: ops...Você não inseriu números decimais, por favor tente novamente.");
            }
            read.nextLine();
        }while (valorDeCompra < 0);

        // Convertendo o valor de 20% e 30% em cima do valor do produto
        porcentagemRepresentante = (valorDeCompra * 20)/100;
        porcentacemDeImposto = (valorDeCompra * 30)/100;

        valorDeVenda = valorDeCompra + porcentagemRepresentante + porcentacemDeImposto;

        System.out.printf("\nRESULTADOS" +
                "\nValor de Venda: %.2f" +
                "\nValor dos Representantes: %.2f" +
                "\nValor dos Impostos: %.2f", valorDeVenda, porcentagemRepresentante, porcentacemDeImposto);
    }
}
