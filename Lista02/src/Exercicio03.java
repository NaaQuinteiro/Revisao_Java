import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int golsA, golsB;

        // instanciando o leitor scanner
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que diz qual o time vencedor com base na quantidade de gols------");

        while (true){
            try {
                System.out.println("Insira a quantidade de gols do time A: ");
                golsA = read.nextInt();

                if(golsA < 0 ){
                    System.out.println("ERRO: Ops... você inseriu um valor negativo, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops...você inseriu caracteres, por favor insira apenas números insteiros positivos.");
            }
            read.nextLine();
        }

        while (true){
            try {
                System.out.println("Insira a quantidade de gols do time B: ");
                golsB = read.nextInt();

                if(golsB < 0 ){
                    System.out.println("ERRO: Ops... você inseriu um valor negativo, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops...você inseriu caracteres, por favor insira apenas números insteiros positivos.");
            }
            read.nextLine();
        }

        if(golsA < golsB){
            System.out.printf("O Time B venceu!!!\nPlacar final:\nTime A = %d  Time B = %d", golsA, golsB);
        } else if (golsA == golsB) {
            System.out.printf("Houve um empate!!!\nPlacar final:\nTime A = %d  Time B = %d", golsA, golsB);
        }else{
            System.out.printf("O Time A venceu!!!\nPlacar final:\nTime A = %d  Time B = %d", golsA, golsB);
        }
    }
}
