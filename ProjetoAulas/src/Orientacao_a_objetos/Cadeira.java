/* PARA DEIXAR COMENTADO, PRESSIONE "Alt + Shift + A" */

package Orientacao_a_objetos;

public class Cadeira {
    private double altura;
    private double altura_assento;
    private String cor = "Marrom";

    public Cadeira(){
        cor = "Marrom";
        altura = 0.50;
        altura_assento = 1.20;
    }

        public void serrar (){
            System.out.println("Serrando a madeira...");
    }
        public void lixar(){
            System.out.println("Lixando a madeira...");
    }
        public void pintar (){
            System.out.println("Pintando a madeira...");
    }

        /* Get para usar a String que você quer */
        public String getCor(){
            return cor;
        }

        /* "||" significa "ou". Só deixa mudar de cor se for uma dessas opções!!! */
        public void setCor (String c) {
            if(c.equals("Verde") || c.equals("Vermelho"))
                cor = c;
            else
                System.out.println("Não há tinta desta cor, somente vermelho e verde.");
    }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getAltura_assento() {
            return altura_assento;
        }

        public void setAltura_assento(double altura_assento) {
            this.altura_assento = altura_assento;
        }

    
}
