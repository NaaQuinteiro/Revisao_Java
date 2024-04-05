import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        String nome, nomeMaiorPeso = null, nomeMaiorAltura = null;
        double peso = 0, altura = 0, maiorPeso = 0, maiorAltura = 0;
        int contador = 1;

        Scanner read = new Scanner(System.in);

        while (contador <=3){
            try {

                System.out.printf("Insira o nome da %d° pessoa: ", contador);
                nome = read.nextLine();

                do{
                    try{
                        System.out.printf("Insira a peso da %d° pessoa: ", contador);
                        peso = read.nextDouble();
                    }catch (InputMismatchException e){
                        System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
                        peso = 0;
                        read.nextLine();
                    }
                }while (peso <= 0);

                do{
                    try{
                        System.out.printf("Insira a altura da %d° pessoa: ", contador);
                        altura = read.nextDouble();
                    }catch (InputMismatchException e){
                        System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
                        altura = 0;
                        read.nextLine();
                    }
                }while (altura <= 0);

                if(peso > maiorPeso){
                    maiorPeso = peso;
                    nomeMaiorPeso = nome;
                }
                if(altura > maiorAltura){
                    maiorAltura = altura;
                    nomeMaiorAltura = nome;
                }
                contador ++;

            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }
        System.out.printf("Pessoa com  maior peso:\nNome: %s  Peso: %.2f", nomeMaiorPeso, maiorPeso);
        System.out.printf("Pessoa com a maior altura:\nNome: %s  Peso: %.2f", nomeMaiorPeso, maiorPeso);
    }
}
