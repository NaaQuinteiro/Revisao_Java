import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        double valorUnitario, valorTotal;
        int quantidade;

        //Instanciando o scanner que le os valores de entrada
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula o valor total dos produtos desejados------");

        while(true){
            try{
                System.out.println("Por favor, insira o valor unitário do produto desejado: ");
                valorUnitario = read.nextDouble();
                if(valorUnitario < 0){
                    System.out.println("ERRO: Ops.. você inseriu números negativos, por favor tente novamente");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente utilizando núm decimais");
            }
            read.nextLine();

        }

        while(true){
            try{
                System.out.println("Por favor, insira a quantidade do produto desejado: ");
                quantidade = read.nextInt();
                if(quantidade <= 0){
                    System.out.println("ERRO: Ops.. você inseriu números negativos ou iguais a 0, por favor tente novamente");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente utilizando núm decimais");
            }
            read.nextLine();
        }

        if (quantidade <=12){
            valorTotal = valorUnitario * quantidade;
        }else{
            valorTotal = (valorUnitario - ((valorUnitario *10)/100)) * quantidade;
        }

        System.out.printf("DADOS OBTIDOS:\n" +
                "Valor unitário: R$ %.2f\n" +
                "Quantidade do produtos: %d\n" +
                "Valor total de compra: %.2f", valorUnitario, quantidade, valorTotal);

    }
}
