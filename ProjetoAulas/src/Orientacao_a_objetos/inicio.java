/* PARA DEIXAR COMENTADO, PRESSIONE "Alt + Shift + A" */

package Orientacao_a_objetos;

public class inicio {
    public static void main(String[] args) {
        Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.pintar();
    System.out.println("Cor atual da cadeira é: " + c1.cor);

       /*  Cadeira c2 = new Cadeira();
        c2.serrar();
        c2.lixar();
        c2.pintar(); */
    }
}
