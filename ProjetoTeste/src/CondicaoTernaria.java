public class CondicaoTernaria {
    
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

// Para tranformar varias linhas em comentario, "Ctrl + ;"
    //Sintaxe NORMAL (Ambas estão certas)
        // String resultado = "";
        //     if(a==b)
        //         resultado = "verdadeiro";
        //     else
        //         resultado = "falso";

        //     System.out.println(resultado);

    //Sintaxe TERNARIA
        String resultado = a==b ?"verdadeiro" : "falso";

            System.out.println(resultado);
    }
}