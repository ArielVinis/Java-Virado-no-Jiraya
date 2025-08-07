package Operadores;
// && = E
// || = OU

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 && (7 > 6)) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");
        }

        System.out.println("Fim.");

        //CRIANDO UMA REGRA EXEMPLIFICADA PARA UTILIZAR || = "OR"
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;

        System.out.println("isPlaystationCompravel " +isPlaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2; // % é RESTO

        System.out.println(bonus);

    }
    
}
