package Exercicio01;

public class Calculo {

    public Double calcularAritimetica(double nota1, double nota2){

        double mediaAritimetica = 0;
        mediaAritimetica = (nota1 + nota2) / 2;

        return mediaAritimetica;
    }

    public Double calcularPonderada(double nota1, double nota2, double peso1, double peso2){

        double mediaPonderada = 0;
        mediaPonderada = ((nota1 * peso1) + (nota2 * peso2))/ (peso1 + peso2);

        return  mediaPonderada;
    }

}
