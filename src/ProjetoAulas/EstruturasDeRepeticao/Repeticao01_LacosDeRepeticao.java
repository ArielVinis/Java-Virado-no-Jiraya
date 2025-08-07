package EstruturasDeRepeticao;

public class Repeticao01_LacosDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        // WHILE PARA CONDIÇÕES
        while (count < 10) {
            System.out.println(++count);
            //count += 1;
            // ou
            //count++;
            //++count;
        }
        do {
            System.out.println("Dentro do Do-While" + ++count);
        } while (count < 10);

        // FOR PARA INDICES
        for (int i=0; i < 10; i++){
            System.out.println("For " +i);
        }
    }
}
