package Exercicio03;

public class Validacao {

    public boolean validarValorEmprestimo(double valorEmprestar){
        if(valorEmprestar > 200000.00){
            return false;
        }else{
            return true;
        }
    }

    public boolean validarEmprestimo(double salario, double valorParcela){

        double porcentagemSalarial = salario * 0.15;

        if (porcentagemSalarial > valorParcela){
            return  false;
        }
        return true;
    }
}
