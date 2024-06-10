package Exercicio01_correcao;

public class Main {
    public static void main(String[] args) {
        EntradaSaida entradaSaida = new EntradaSaida();
        Validacao validacao = new Validacao(entradaSaida);
        validacao.validarValores();
    }
}

