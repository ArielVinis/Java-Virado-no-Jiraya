package Orientacao_a_objetos;

public class Aluno {
    private String nome;
    private String telefone;
    private String matricula;
    
    /* Construtor */
    public Aluno(String nome) {
        this.nome = nome;
    }

    /* "Alt + insert" para criar Set e Get mais rapido. */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    public void ImprimeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Matricula: " + this.getMatricula());
    }
    
    public static double Media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
        
    }
}
