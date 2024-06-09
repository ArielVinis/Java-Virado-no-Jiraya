package Estruturas;

public class Condicionais01_if {
    public static void main(String[] args) {
        // if SÓ EXECUTA SE FOR VERDADEIRO = true
        // SE FOR FALSO = false, ELE NÃO EXECUTA.

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        //ESSE CODIGO FUNCIONA INDEPENDENTE
        // ! = "== false"
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.println("Fora do if");
    }
}
