package Exercicio01_correcao;

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class EntradaSaida {
    private String nota1;
    private String nota2;
    private String peso1;
    private String peso2;
    private String tipoMediaString;
    private TipoMedia tipoMedia;


    private Scanner read = new Scanner(System.in);

    //construtor sem paramentros para chmar os métodos sets quando a classe for instanciada
    public EntradaSaida() {
        setNota1();
        setNota2();
        setPeso1();
        setPeso2();
        setTipoMediaString();
    }

    public void setTipoMediaString(){
        System.out.print("Qual o tipo de média desejada: Aritimética ou Ponderada");
        this.tipoMediaString = read.nextLine().toUpperCase(); //O tuupercase serve para colocar as letras em caixa alta
    }

    public  String getTipoMediaString(){
        return this.tipoMediaString;
    }

    public void setTipoMedia(TipoMedia tipoMedia) {
        this.tipoMedia = tipoMedia;
    }

    public void setNota1(){
        System.out.print("Insira o valor da 1° nota: ");
        this.nota1 = read.nextLine();
    }

    public void setNota2(){
        System.out.print("Insira o valor da 2° nota: ");
        this.nota2 = read.nextLine();
    }

    public void setPeso1(){
        System.out.print("Insira o valor do 1° peso: ");
        this.peso1 = read.nextLine();
    }

    public  void setPeso2(){
        System.out.print("Insira o valor do 2° peso: ");
        this.peso2 = read.nextLine();
    }

    public String getNota1(){
        return nota1;
    }

    public String getNota2(){
        return nota2;
    }

    public String getPeso1(){
        return peso1;
    }

    public String getPeso2(){
        return peso2;
    }

}
