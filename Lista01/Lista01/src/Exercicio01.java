import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        // variáveis de entrada

        String nome, sobrenome, dataNascimento,grauDeInstrucao, cargoPretendido;
        String possuiCNH = null;
        double pretensaoSalarial;
        int dia, mes, ano,instrucao, possuiCNHB;

        // Instanciando o scanner de leitura de dados
        Scanner read = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo á etapa de cadastro para vagas na Bosch!\n" +
                "Daremos início ao seu cadastro, solicitando algumas informações.");

        System.out.println("Insira o seu nome: ");
        nome = read.nextLine();

        System.out.println("Insira o seu sobrenome: ");
        sobrenome = read.nextLine();

        //Quando roda o programa não consigo inserir dados aq, ele pula pra prox leitura
        System.out.println("Insira o cargo pretendido: ");
        cargoPretendido = read.nextLine();

        // teste do joão
        System.out.println("Insira o dia que você nasceu: ");
        dia = read.nextInt();

        System.out.println("Insira o mês que você nasceu: ");
        mes = read.nextInt();

        System.out.println("Insira o ano que você nasceu (ex:2005): ");
        ano = read.nextInt();

        dataNascimento = String.format("%d/%d/%d", dia, mes, ano);

        System.out.println("Insira a sua pretenção salarial: ");
        pretensaoSalarial = read.nextDouble();

        System.out.println("Escolha o seu grau de instrução:\n1 - Ensino Médio\n2 - Ensino Técnico\n3 - Ensino Superior ");
        instrucao = read.nextInt();

        switch (instrucao){
            case 1:
                grauDeInstrucao = "Ensino Médio";
                break;
            case 2:
                grauDeInstrucao = "Ensino Técnico";
                break;
            case 3:
                grauDeInstrucao = "Ensino Superior";
                break;
            default:
                grauDeInstrucao = "Não se aplica";
                break;
        }

        System.out.println("Você possuí CNH do tripo B?\n1 - Sim\n2 - Não");
        possuiCNHB = read.nextInt();

        switch (possuiCNHB){
            case 1:
                possuiCNH = "Sim";
                break;
            case 2:
                possuiCNH = "Não";
                break;
        }


        // Saída
        System.out.printf("CADASTRO CONFIRMADO:\n" +
                        "Nome: %s\n" +
                        "Sobrenome: %s\n" +
                        "Data de nascimento: %s\n" +
                        "Pretençaõ Salarial: %s\n" +
                        "Grau de Instrução: %s\n" +
                        "Cargo Pretendido: %s\n" +
                        "Possui CNH do tipo B: %s\n", nome, sobrenome, dataNascimento,
                pretensaoSalarial, grauDeInstrucao, cargoPretendido, possuiCNH);


    }
}
