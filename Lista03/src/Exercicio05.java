import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        double saldo;
        int contador = 1, saldoPositivo = 0, saldoNegativo = 0, continuar;

        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que mostra se há risco ao banco ou não------");
        while (true){

            while (true){
                try {

                    System.out.printf("Insira o saldo da %d° pessoa: ", contador);
                    saldo = read.nextDouble();

                    if(saldo <= 0){
                        saldoNegativo = saldoNegativo + 1;
                        contador = contador + 1;
                    }
                    else{
                        saldoPositivo = saldoPositivo +1;
                        contador = contador + 1;
                    }
                    break;

                }catch (InputMismatchException e){
                    System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
                }
                read.nextLine();
            }

            System.out.println("Deseja continuar inserindo saldos?\n1 -Sim\n2 - Não ");
            continuar = read.nextInt();

            if(continuar == 1){
                continue;
            }else{
                System.out.println("Okk!!\n");
                break;
            }

        }

        if(saldoPositivo >= (contador/2)){
            System.out.println("Nenhum risco!");
        }else{
            System.out.println("Risco ao banco!");
        }

    }
}
