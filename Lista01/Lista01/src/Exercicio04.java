import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int numInteiro = 0, antecessor, sucessor;
        boolean verifica = true;

        // instanciando o scanner de leitura dos inputs
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que mostra o antecessor e sucessor de um num inteiro------");

        // permite que o usuário insira novamente enquanto não inserir p valor certo
        do{
            try{
                System.out.println("Insira um número inteiro: ");
                numInteiro = read.nextInt();
                verifica = false;
            }catch (InputMismatchException e){
                System.out.println("ERRO: ops...Você não inseriu um número inteiro, por favor tente novamente.");
            }
            read.nextLine();
        }while (verifica);

        // Contas
        antecessor = numInteiro - 1;
        sucessor = numInteiro + 1;

        // Saídas
        System.out.printf("O número informado foi %d, o seu antecessor é %d e o sucessor %d.", numInteiro, antecessor,
                sucessor);
    }

}
