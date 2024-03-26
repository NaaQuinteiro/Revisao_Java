import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        double nota1 = 0, nota2, mediaPonderada;
        double peso1, peso2;

        // instanciando o scanner de leitura dos inputs
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que calcula a média pnderada de 2 notas------");

        // laços que permitem o usuário inserir o valor até que ele seja válido
        while(true) {
            try {
                System.out.println("Insira a 1° nota: ");
                nota1 = read.nextDouble();

                if (nota1 < 0){
                    continue;
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();
        }

        while(true) {
            try {
                System.out.println("Insira a 2° nota: ");
                nota2 = read.nextDouble();

                if (nota2 < 0){
                    continue;
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();
        }

//        peso1 = (nota1 * 40)/100;
//        peso2 = (nota2 * 60)/100;
        peso1 = (double) 40/100;
        peso2 = (double)60/100;

        mediaPonderada =  (nota1 * peso1) + (nota2 * peso2) / (peso1 + peso2);

        System.out.printf("Média Ponderada = %.2f", mediaPonderada);

    }
}
