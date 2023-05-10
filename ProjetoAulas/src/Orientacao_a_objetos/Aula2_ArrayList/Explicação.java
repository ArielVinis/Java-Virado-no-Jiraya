package Orientacao_a_objetos.Aula2_ArrayList;

import java.util.ArrayList;

public class Explicação {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ariel");
        lista.add("Gilnei");
        lista.add("Marcos");


        /* Caso precise realizar algum calculo ou media */
        for(int i=0;i<lista.size();i++){ 
            System.out.println(lista.get(i));
        }
                
        /* "\n" quebra uma linha para não ficar tudo amontoado */
        System.out.println("\n");

        /* Ficar melhor para ler, mas não realiza calculo ou media */
        for(String lista1 : lista){
            System.out.println(lista1);
        }

        
    }
}
