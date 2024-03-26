import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        double altura, peso;
        int idade, acima50 = 0, acima160 = 0, abaixo80 = 0;
        int contador = 1, opcaoUsuario;

        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa onde o usuario pode escolher vizualiza dados a respeito das informaçõe inseridas------");

        do{

            while (true){
                try {
                    System.out.printf("\nInsira a idade da %d° pessoa: ", contador);
                    idade = read.nextInt();

                    System.out.printf("\nInsira o peso da %d° pessoa: ", contador);
                    peso = read.nextDouble();

                    System.out.printf("\nInsira a altura da %d° pessoa: ", contador);
                    altura = read.nextDouble();
                    break;

                }catch (InputMismatchException e){
                    System.out.println("ERRO: Ops.. você inseriu caracteres, por favor tente novamente com números inteiros");
                }
                read.nextLine();
            }

            if(idade > 50){
                acima50 = acima50 +1;

            }

            if(peso < 80){
                abaixo80 = abaixo80 +1;
            }

            if(altura > 1.60){
                acima160 = acima160 +1;
            }

            contador = contador +1;

        }while (contador <= 10);


        while (true){
            try {
                System.out.println("\nO que você deseja ver:\n" +
                        "1. Quantas tem idade acima de 50 anos\n" +
                        "2. Quantas tem altura acima de 1.60m\n" +
                        "3. Quantas tem peso abaixo de 80kg\n" +
                        "4. Sair do programa");
                opcaoUsuario = read.nextInt();

                switch (opcaoUsuario){
                    case 1: {
                        System.out.printf("\nQuantidade de pessoas com idade acima de 50 anos: %d\n", acima50);
                        continue;
                    }
                    case 2: {
                        System.out.printf("\nQuantidade de pessoas com altura acima de 1.60m: %d\n", acima160);
                        continue;
                    }
                    case 3: {
                        System.out.printf("\nQuantidade de pessoas com peso abaixo de 80kg: %d\n", abaixo80);
                        continue;
                    }
                    case 4:{
                        System.out.print("\nObrigada por usar nosso programa! Até logo =)");
                        System.exit(0);
                    }
                    default:{
                        System.out.println("\nOpção inválida, tente novamente\n");
                        continue;
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops.. você inseriu caracteres, por favor tente novamente com números inteiros");
            }
            read.nextLine();
        }
    }
}
