package EstruturasDeRepeticao;

public class Repeticao02_For_Exerc {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000

        // int count = 2;
        // while (count < 1000000){
        //     System.out.println(++count); }
        // ou

        for (int i = 0; i <= 1000000; i++) {
            // "Se o %(resto) de 'i' for ==(igual) a zero, significa que ele é par"
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
