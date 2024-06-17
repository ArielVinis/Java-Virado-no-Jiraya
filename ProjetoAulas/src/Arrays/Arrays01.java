package Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // REFERENCE/Array = OBJETO
        // "new" é quando está criando um array
        int[] idades = new int[3];

        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        // Não existe, pois só tem 3 espaços e começa a contar de zero.
        idades[3] = 5;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
