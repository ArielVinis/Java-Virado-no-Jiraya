package Operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        // == IGUAL A 
        // != DIFERENTE DA OUTRA 
        // >  MAIOR QUE 
        // >= MAIOR OU IGUAL 
        // <  MENOS QUE 
        // <= MENOR OU IGUAL 

        String nomeUm = "ARIEL"; 
        String nomeDois = new String ("ARIEL");
            System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
            
            if (numero1 < numero2){ //TRUE
            System.out.println("A nossa condição é verdadeira");
        }

            System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
            System.out.println("numero1 é diferente a numero2? " + simNao);

        simNao = numero1 > numero2;
            System.out.println("numero1 é maior que numero2? " + simNao);

    }
    
}
