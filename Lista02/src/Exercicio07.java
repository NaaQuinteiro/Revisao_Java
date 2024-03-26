import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        int escolhaPergunta;
        String pergunta1, pergunta2;

        Scanner read = new Scanner(System.in);

        System.out.println("\n------Programa onde o usuario deve escolher entre 2 perguntas para responder------");

        while (true){
            try {
                System.out.println("Você deseja responder a qual pergunta?\n" +
                        "1 - Pergunta 1\n2 - Pergunta 2");
                escolhaPergunta = read.nextInt();

                if(escolhaPergunta <=0 || escolhaPergunta >2){
                    System.out.println("ERRO: Resposta inválida, por favor tente novamente.");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("ERRO: Você inseriu caracteres, por favor tente novamente.");
            }
        }

        switch (escolhaPergunta){
            case 1: {
                System.out.println("1 - Qual é o nome do diretor da Escola de Magia e Bruxaria de Hogwarts?\n" +
                        "a) Severus Snape\n" +
                        "b) Albus Dumbledore\n" +
                        "c) Rúbeo Hagrid");
                pergunta1 = read.next().toLowerCase();// deixa tudo minusculo

                // Comparando as respostas
                if(pergunta1.equals("b")){
                    System.out.println("\nVocê acertou, pode retirar seu bônus na Shostners and Shostners");
                    break;
                }else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima");
                    break;

                }

            }
            case 2:
                System.out.println("Qual é a casa em Hogwarts cujos membros são conhecidos por sua lealdade, coragem e determinação?\n" +
                        "a) Lufa-Lufa\n" +
                        "b) Sonserina\n" +
                        "c) Grifinória");
                pergunta2 = read.next().toLowerCase();

                // Comparando as respostas
                if(pergunta2.equals("c")){
                    System.out.println("\nVocê acertou, pode retirar seu bônus na Shostners and Shostners");
                    break;
                }else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima!");
                    break;
                }

        }
        read.close();
    }
}
