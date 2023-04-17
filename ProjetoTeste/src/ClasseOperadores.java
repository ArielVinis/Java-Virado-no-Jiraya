import java.util.Date;

public class ClasseOperadores {
    public static void main(String[] Args) {
        String nome = "Ariel";
        int idade = 27;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(1997/11/27);

        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  


        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho " + idade + " anos de idade.");
        System.out.println("No momento estou pesando: " + peso);
        System.out.println("Sou do sexo: " + sexo);
        System.out.println("Doador de orgão? " + doadorOrgao);
        System.out.println("Minha data de nascimento é: " + dataNascimento);
        System.out.println(date); 

    }
}