package Operadores;
// && = E
// || = OU

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 && (7 > 6)){
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }

            System.out.println("Fim.");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;

        System.out.println("isPlaystationCompravel " +isPlaystationCompravel);

    }
    
}
