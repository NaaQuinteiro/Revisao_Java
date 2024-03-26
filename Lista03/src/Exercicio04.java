import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int num, incremento;



        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que mostra o os valores incrementados até o numero informado------");

        while (true){
            try {
                System.out.println("Insira um número para finalizar a contagem: ");
                num = read.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        while (true){
            try {
                System.out.println("Insira o incremento da contagem: ");
                incremento = read.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        System.out.println("Número: " + num);
        System.out.println("Incremento: " + incremento);

        for (int i = 0; i <= num; i += incremento){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}
