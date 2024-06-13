package EstruturasCondicionais;

public class Condicionais03_Ternario {
    public static void main(String[] args) {

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pro Ariel";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        // (condicao) ? verdadeiro : falso
        String resultado1 = salario > 2000 ? mensagemDoar : mensagemNaoDoar;
        // OU
        String resultado2 = salario > 4000 ? "Eu vou doar 500 pro Ariel" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
