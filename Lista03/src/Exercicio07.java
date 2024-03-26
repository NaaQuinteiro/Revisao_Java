import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        String nome, nomeMaiorPeso = null, nomeMaiorAltura;
        double peso, altura, maiorPeso = 0, maiorAltura = 0;
        int contador = 1;

        Scanner read = new Scanner(System.in);

        while (contador <=6){
            try {
                System.out.printf("Insira o nome da %d° pessoa: ", contador);
                nome = read.nextLine();

                System.out.printf("Insira a peso da %d° pessoa: ", contador);
                peso = read.nextDouble();

                System.out.printf("Insira a altura da %d° pessoa: ", contador);
                altura = read.nextDouble();

                if(peso > maiorPeso){
                    maiorPeso = peso;
                    nomeMaiorPeso = nome;
                    contador ++;
                }
                if(altura > altura){
                    maiorAltura = altura;
                    nomeMaiorAltura = nome;
                    contador ++;
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }
        System.out.printf("Pessoa com  maior peso:\nNome: %s  Peso: %.2f", nomeMaiorPeso, maiorPeso);
        System.out.printf("Pessoa com a maior altura:\nNome: %s  Peso: %.2f", nomeMaiorPeso, maiorPeso);
    }
}
