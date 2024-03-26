import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double qtdAtualEstoque, qtdMaxEstoque, qtdMinEstoque, qtMedia;

        // Instanciando o scanner
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula a média de produtos num estoque------");
        //loop para inserir corretamente os valores

        while (true){
            try {
                System.out.println("Digite a quantidade atual de produtos no estoque:");
                qtdAtualEstoque = read.nextDouble();

                if (qtdAtualEstoque < 0){
                    System.out.println("ERRO: Ops... você inseriu uma opção inválida, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        while (true){
            try {
                System.out.println("Digite a quantidade Máxima de produtos no estoque:");
                qtdMaxEstoque = read.nextDouble();

                if (qtdMaxEstoque < 0){
                    System.out.println("ERRO: Ops... você inseriu uma opção inválida, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        while (true){
            try {
                System.out.println("Digite a quantidade mínima de produtos no estoque:");
                qtdMinEstoque = read.nextDouble();

                if (qtdMinEstoque < 0){
                    System.out.println("ERRO: Ops... você inseriu uma opção inválida, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        qtMedia = (qtdMaxEstoque + qtdMinEstoque)/2;

        if(qtdAtualEstoque >= qtMedia){
            System.out.println("Não efetuar compra");
        }else{
            System.out.println("Efetuar compra");
        }
    }
}
