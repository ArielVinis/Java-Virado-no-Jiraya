package Arrays;

public class Arrays03_Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};

        //for "índice" (serve para ver um índice específico)
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // For each (faz a referência exata do que está descrito no objeto)
        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
