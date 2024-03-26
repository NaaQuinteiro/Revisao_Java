import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int opiniaoUsuarios, continuar;
        int otimo =0, bom = 0, ruim = 0, total;
        double porcOtimo, porcBom, porcRuim, media;

        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa de avaliação de filme------");

        while (true){
            System.out.println("Deseja inserir quantas avaliações? ");
            total = read.nextInt();

            for(int i = 0; i < total; i++){
                try {
                    System.out.println("Qual a sua avaliação do filme 'Harry Potter e o Prisioneiro de Askaban'?\n" +
                            "1 - Ótimo\n" +
                            "2 - Bom\n" +
                            "3 - Ruim\n");
                    opiniaoUsuarios = read.nextInt();

                    switch (opiniaoUsuarios){
                        case 1: {
                            otimo ++;
                            continue;
                        }
                        case 2:{
                            bom ++;
                            continue;
                        }
                        case 3: {
                            ruim ++;
                            continue;
                        }
                        default:{
                            System.out.println("Opção invalida, tente novamente");
                            i = i - 1;
                            continue;
                        }
                    }

                }catch (InputMismatchException e){
                    System.out.println("ERRO: Ops... você inseriu caracteres, por favor tente novamente.");
                    i = i - 1;
                }
                read.nextLine();

            }

            porcOtimo = (otimo * 100)/(double)total;
            porcBom = (bom * 100)/(double)total;
            porcRuim = (ruim * 100)/(double)total;
            media = ((otimo) +( 2 * bom) + (3 * ruim))/(double)total;

            System.out.printf("\nAvaliações Ótimas: %d   Porcentagem: %.2f\n", otimo, porcOtimo );
            System.out.printf("Avaliações Boas: %d   Porcentagem: %.2f\n", bom, porcBom );
            System.out.printf("Avaliações Ruins: %d   Porcentagem: %.2f\n", ruim , porcRuim );
            System.out.printf("Média das avaliações: %.2f\n", media );
            System.out.printf("Total de respostas: %d\n", total);

            System.out.println("Deseja continuar?\n1 - Sim\n2 - Não");
            continuar = read.nextInt();

            if (continuar ==1){
                continue;
            }else{
                System.out.println("Okay obrigada pela sua avaliação!!!");
                break;
            }

        }
    }

}
