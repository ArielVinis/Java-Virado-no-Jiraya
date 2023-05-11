package Comentários_Erros_e_TryCatch;

public class TratamentoDeExceção {
    public static void main(String[] args) {
        
        try {
            System.out.println(args[0] + "\n\n");

            double valor = Double.parseDouble(args[0]);
            System.out.println(valor);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            /* "Ctrl + espaço"
            classe para tratamento de exceção
            Quando estoura o array. */
        System.out.println("Nenhum argumento informado! ");
        }
        // O finally, independente do resultado, ele vai mostrar a mensagem final"
        finally{
            System.out.println("Obrigado!");
        }

    }
}