package Comentários_Erros_e_TryCatch;

public class TratamentoDeExceção {
    public static void main(String[] args) {
        
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            /* "Ctrl + espaço"
            classe para tratamento de exceção
            Quando estoura o array. */
        System.out.println("Nenhum argumento informado! " + e.getMessage());
        }

    }
}