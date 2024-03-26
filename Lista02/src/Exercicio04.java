import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int destino, almocoJanta;
        double valorFinalViagem, valorBase = 3000;

        //instanciando o leitor
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula o valor totalda viagem de acordo com as\n" +
                "escolhas feitas pelo usuário------");
        //loop para inserir corretamente os valores

        while (true){
            try {
                System.out.println("Digite o número correspondente ao destino desejado:\n" +
                        "1 - Maceió\n2 - Porto de Galinhas");
                destino = read.nextInt();

                if (destino <= 0 || destino >2){
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
                System.out.println("Deseja com almoço/janta inclusos?\n" +
                        "1 - Sim\n2 - Não");
                almocoJanta = read.nextInt();

                if (almocoJanta <= 0 || destino >2){
                    System.out.println("ERRO: Ops... você inseriu uma opção inválida, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        switch (destino){
            case 1: {
                switch (almocoJanta){
                    case 1: {
                        valorFinalViagem = valorBase + valorBase;
                        System.out.printf("\nDADOS DA VIAGEM:\n" +
                                "Destino: Maceió\n" +
                                "Almoço/Janta inclusos: Sim\n" +
                                "Valor total da viagem: R$%.2f", valorFinalViagem);
                        break;
                    }
                    case 2: {
                        valorFinalViagem = valorBase + (valorBase * 0.85);
                        System.out.printf("\nDADOS DA VIAGEM:\n" +
                                "Destino: Maceió\n" +
                                "Almoço/Janta inclusos: Não\n" +
                                "Valor total da viagem: R$%.2f", valorFinalViagem);
                        break;
                    }
                }
            }
            case 2:{
                switch (almocoJanta){
                    case 1: {
                        valorFinalViagem = valorBase +(valorBase * 0.60);
                        System.out.printf("\nDADOS DA VIAGEM:\n" +
                                "Destino: Porto de Galinhas\n" +
                                "Almoço/Janta inclusos: Sim\n" +
                                "Valor total da viagem: R$%.2f", valorFinalViagem);
                        break;
                    }
                    case 2: {
                        valorFinalViagem = valorBase + (valorBase * 0.45);
                        System.out.printf("\nDADOS DA VIAGEM:\n" +
                                "Destino: Porto de Galinhas\n" +
                                "Almoço/Janta inclusos: Não\n" +
                                "Valor total da viagem: R$%.2f", valorFinalViagem);
                        break;
                    }
                }
            }
        }
    }
}
