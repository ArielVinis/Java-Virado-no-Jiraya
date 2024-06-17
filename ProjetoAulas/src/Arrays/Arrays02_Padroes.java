package Arrays;

public class Arrays02_Padroes {
    public static void main(String[] args) {
        // byte, short, int, long, float e double é 0 (Não pode dar NEW em tipos primitivos)
        // char é '\u0000' ' '
        // boolean é false
        // String é null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Toji Fushiguro";
        // nomes[3] = "Satoru Gojo";

        // o ".length" vai utilizar todos os objetos que estão na referência
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
