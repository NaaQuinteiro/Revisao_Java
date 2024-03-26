import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        // variaveis de entrada
        int numero1 = 0, numero2 = 0;

        // Operações
        double soma, subtracao, multiplicacao, divisao, restoDaDivisao, exponenciacao;
        boolean numerosValidos = true;

        // instanciando o scanner de leitura
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Mostrar operações entre 2 n° inteiros------");

        // enquanto não for inserido um numero valido o usuário tem que tentar novamente.
        do{
            try{
                System.out.println("Insira o 1° número inteiro para realizar as operações: ");
                numero1 = read.nextInt();
                System.out.println("Insira o 2° número inteiro para realizar as operações: ");
                numero2 = read.nextInt();
                numerosValidos = false;
            }catch (InputMismatchException e){
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();
        } while (numerosValidos);

        // Calculando
        soma = numero1 + numero2;
        System.out.printf("\nSoma = %.2f", soma);

        subtracao = numero1 - numero2;
        System.out.printf("\nSubtração = %.2f", subtracao);

        multiplicacao = numero1 *  numero2;
        System.out.printf("\nMultiplicação = %.2f", multiplicacao);

        // condição que verifica se o segundo numero é 0 para fazer a divisão, se for ele não faz
        if(numero2 != 0){
            divisao = (double)numero1 / numero2;
            System.out.printf("\nDivisão = %.2f", divisao);

            restoDaDivisao = numero1 % numero2;
            System.out.printf("\nResto da divisão = %.2f", restoDaDivisao);

        }else{
            System.out.print("\nA divisão não poderá ser realizada, pois não existe divisão por 0");
        }

        exponenciacao = Math.pow(numero1, numero2);
        System.out.printf("\nPotência = %.2f", exponenciacao);
    }
}
