import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        int numero, multiplica;

        System.out.println("\n------Programa que mostra os valores da tabuada formatados------");

        Scanner read = new Scanner(System.in);

        while (true){
            try {

                System.out.println("Insira umnúmero para calcular a tabuada: ");
                numero = read.nextInt();

                if(numero <= 0){
                    System.out.println("ERRO: Ops... você inseriu numeros negativos, por favor tente novamente.");
                    continue;
                }
                break;

            }catch (InputMismatchException e){
                System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
            }
            read.nextLine();
        }

        System.out.println("Tabuada do numero "+ numero);
        for(int i = 0; i <= 10; i++){
            multiplica = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, multiplica);
        }
    }
}
