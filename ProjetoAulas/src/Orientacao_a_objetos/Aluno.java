package Orientacao_a_objetos;

public class Aluno {
    private String nome;
    private String telefone;
    private String matricula;

    /* "Alt + insert" para criar Set e Get mais rapido. */
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
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
    
}
