package Exercicio01;

import java.util.Scanner;

public class EntradaSaida {
    double nota;
    double peso;


    public EntradaSaida() {

    }

    Scanner read = new Scanner(System.in);

    public Double entradaDeNotas(){

        System.out.println("Insira a nota: ");
        this.nota = read.nextDouble();

        return this.nota;

    }

    public Double entradaDePeso(){
        System.out.println("Insira o peso da 1° nota: ");
        this.peso = read.nextDouble();
        return this.peso; // ainda não ta certo também
    }

    public double getNota() {
        return nota;
    }

    public double getPeso() {
        return peso;
    }

    public Scanner getRead() {
        return read;
    }
}
