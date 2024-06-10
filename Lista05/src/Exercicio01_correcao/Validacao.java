package Exercicio01_correcao;

public class Validacao {
    EntradaSaida entradaSaida;
    boolean valido = false;

    public Validacao(EntradaSaida entradaSaida){
        this.entradaSaida = entradaSaida;
    }

    private boolean validar(String par){
        try{
            //tenta converter as strings para numeros
           double number = Double.parseDouble(par);
           return (number < 0 ) || number > 10;

        }catch (NumberFormatException numberFormatException){
            return true; //
        }
    }

    public void validarTipoMedia(){
        try{
            entradaSaida.setTipoMedia(TipoMedia.valueOf(entradaSaida.getTipoMediaString()));
        }catch (IllegalArgumentException e){
            entradaSaida.setTipoMediaString();
            validarTipoMedia();//função recursiva: função que chama a si mesma até ser resolvida

        }
    }

    public boolean validarValores(){
        while (!valido){
            if(validar(entradaSaida.getNota1())){
                System.out.println("Nota 1, foi digitada incorretamente: ");
                entradaSaida.setNota1(); //aqui possibilita chamar o scanner de entrada e saida novamente
                continue; //reinicia o laço
            }

            if (validar(entradaSaida.getNota2())){
                System.out.println("Nota 2, foi digitada incorretamente: ");
                entradaSaida.setNota2();
                continue;
            }

            if (validar(entradaSaida.getPeso1())){
                System.out.println("Peso 1, foi digitado incorretamente: ");
                entradaSaida.setPeso1();
                continue;
            }

            if(validar(entradaSaida.getPeso2())){
                System.out.println("Peso 2, foi digitado incorretamente: ");
                entradaSaida.setPeso2();
                continue;
            }
            validarTipoMedia();
            this.valido=true;

        }
        return true;
    }
}
