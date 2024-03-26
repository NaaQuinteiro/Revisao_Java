import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        // Definindo o intervalo desejado
        int min = 1;
        int max = 100;
        int numAleatorio;
        int tentativas = 3;
        int chuteUsuario;

        // Cria uma instancia da classe random
        Random sorteio = new Random();

        // criando a instancia do scanner
        Scanner read = new Scanner(System.in);

        // gerando o numero aleatorio
        numAleatorio = sorteio.nextInt(max - min + 1) + min;
        System.out.println(numAleatorio);

        System.out.println("\n------Programa que permite o usuario tentar acertar um numero aleatorio------");
        while (tentativas > 0){
            try {
                System.out.println("Tente acertar o número entre 1 e 100: ");
                chuteUsuario = read.nextInt();

                if(chuteUsuario <1 || chuteUsuario >100){
                    System.out.println("ERRO: Insira números apenas entre 1 e 100, por favor tente novamente.");
                    continue;
                }
                else if (chuteUsuario == numAleatorio){
                    System.out.println("Parabéns!!! Você acertou!");
                    break;
                }
                else{
                    tentativas = tentativas - 1;
                    System.out.printf("Você tem %d tentativas.\n", tentativas);
                }

            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        if (tentativas == 0) {
            System.out.printf("HA HA HA!!! Você Errou!\nO número sorteado era %d", numAleatorio);
        }
    }
}
