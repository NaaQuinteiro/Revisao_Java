package Exercicio01;

import java.util.Scanner;

public class EntradaSaida {

    Scanner read = new Scanner(System.in);
    Validacao validacao = new Validacao();

    public Double entradaDeNotas(int i){
        double nota = 0;

        do{
            System.out.printf("Insira a %d° nota: ", i);
            nota = read.nextDouble();

            if(validacao.validarNota(nota)){
                System.out.println("Nota inválida, tente novamente!");
            }
        }while (validacao.validarNota(nota)); // repete enquanto a validação for falsa

        return nota;
    }

    public Double entradaDePeso(int i){

        double peso = 0;

        do{
            System.out.printf("Insira o %d° peso: ", i);
            peso = read.nextDouble();

            if(peso <0){
                System.out.println("Peso inválido, insira um valor positivo!");
            }
        }while (peso < 0); // impede pesos negativos

        return peso;
    }

}
