import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int hora = 0, minuto = 0, segundo = 0, totalSegundos;
        boolean verificar = true;

        // instanciando o scanner de leitura dos inputs
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que mostra o total de segundos de um horário------");

        // laços que permitem o usuário inserir o valor até que ele seja válido
        do{
            try {
                System.out.println("Insira a hora: ");
                hora = read.nextInt();
                if(hora >= 0){
                    verificar = false;
                }

            }catch (InputMismatchException e){
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();

        }while (verificar);

        do{
            try {
                verificar = true;
                System.out.println("Insira os minutos: ");
                minuto = read.nextInt();
                if(minuto > 0){
                    verificar = false;
                }

            }catch (InputMismatchException e){
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();
        }while (verificar);

        do{
            try {
                verificar = true;
                System.out.println("Insira os segundos: ");
                segundo = read.nextInt();
                if(segundo >= 0){
                    verificar = false;
                }
            }catch (InputMismatchException e){
                System.out.println("Por favor insira apenas numeros inteiros, tente novamente!");
            }
            read.nextLine();
        }while (verificar);

        // convertendo para segundos
        hora = (hora * 60)*60;
        minuto = (minuto *60);

        totalSegundos = segundo + hora + minuto;

        System.out.printf("O horario total em segundos: %d segundos", totalSegundos);
    }
}
