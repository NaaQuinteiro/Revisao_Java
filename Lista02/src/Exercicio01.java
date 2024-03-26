import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int idade = 0;
        boolean condicao = true;

        // instanciando o scanner de leitura
        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa que mostra a faixa etaria em que o usuário está inserido------");

        // loop pro usuario inserir corretamente
        while(condicao) {
            try{
                System.out.println("Insira a sua idade: ");
                idade = read.nextInt();
                if (idade < 0){
                    System.out.println("ERRO: ops...Você não inseriu números positivos, por favor tente novamente.");
                    continue;
                }
                condicao = false;
            }catch (InputMismatchException e){
                System.out.println("ERRO: ops...Você não inseriu números inteiros positivos, por favor tente novamente.");
            }
            read.nextLine();
        }

        // Condições
        if(idade >= 30){
            System.out.printf("Idade: %d\nClassificação: Adulto", idade);
        } else if (idade >= 18) {
            System.out.printf("Idade: %d\nClassificação: Adulto Jovem", idade);
        } else if (idade >=15) {
            System.out.printf("Idade: %d\nClassificação: Adolescente", idade);
        }else{
            System.out.printf("Idade: %d\nClassificação: Criança", idade);
        }

    }
}