package Exercicio01;

public class Validacao {

    public boolean validarNota(double nota){
        if (nota >=0 && nota <=10){
            return false;
        }
        else{
            return true;
        }

    }
}
