/* PARA DEIXAR COMENTADO, PRESSIONE "Alt + Shift + A" */

package Orientacao_a_objetos;

public class Principal {
    public static void main(String[] args) {
        /* Cadeira c1 = new Cadeira();
        c1.serrar();
        c1.lixar();
        c1.setCor("Azul");
        c1.pintar();
    System.out.println("Cor atual da cadeira é: " + c1.getCor()); */

        /* New cria um NOVO item que já existe, podendo nomear ele como quiser. Ex: c2 */
        /*  Cadeira c2 = new Cadeira();
        c2.serrar();
        c2.lixar();
        c2.pintar(); */
    
        Aluno a1 = new Aluno("Ariel");
        a1.setTelefone("48 9 9999-9999");
        a1.setMatricula("001");

        Aluno a2 = new Aluno("Gilnei");
        a2.setTelefone("53 9 9999-9999");
        a2.setMatricula("002");

        /* System.out.println("Nome: " + a1.getNome());
        System.out.println("Telefone: " + a1.getTelefone());
        System.out.println("Matricula: " + a1.getMatricula());
        
        System.out.println("\n");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("Telefone: " + a2.getTelefone());
        System.out.println("Matricula: " + a2.getMatricula()); */
        
        /* Realiando essa função de ImprimeDados, poupa linha e esforço. */
        a1.ImprimeDados();
        System.out.println("\n");
        a2.ImprimeDados();
    
        double media = Aluno.Media(10, 15);
        System.out.println("Média: " + media);
    }

}
