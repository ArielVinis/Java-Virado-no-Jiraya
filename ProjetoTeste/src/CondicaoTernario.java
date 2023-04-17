public class CondicaoTernario {
    
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;

        //Sintaxe NORMAL
        String resultado = "";
            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";

            System.out.println(resultado);

        //Sintaxe TERNARIA
        String resultado = a==b ?"verdadeiro" : "falso";

            System.out.println(resultado);
    }
}
// Para tranformar varias linhas em comentario, "Ctrl + ;"