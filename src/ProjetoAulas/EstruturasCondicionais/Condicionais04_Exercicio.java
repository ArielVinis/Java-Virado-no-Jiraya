package EstruturasCondicionais;

// I WANT TO KNOW HOW MUCH I HAE TO PAY IN THE NETHERLANDS 2020 BASED ON MY ANNUAL SALARY
public class Condicionais04_Exercicio {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
            // TAMBÉM PODE SER FEITO DA SEGUINTE FORMA
            // salarioAnual *= primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
