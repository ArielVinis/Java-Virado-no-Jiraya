/* PARA DEIXAR COMENTADO, PRESSIONE "Alt + Shift + A" */

package Orientacao_a_objetos;

public class Principal {
    public static void main(String[] args) {
        Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.setCor("Azul");
        c1.pintar();
    System.out.println("Cor atual da cadeira é: " + c1.getCor());

        /* New cria um NOVO item que já existe, podendo nomear ele como quiser. Ex: c2 */
        /*  Cadeira c2 = new Cadeira();
        c2.serrar();
        c2.lixar();
        c2.pintar(); */
    }
}
