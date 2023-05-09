package Orientacao_a_objetos.Aula2_ListaDeObjetos;

    public class Aluno{
        private String Nome;
        private String Matricula;
        private String Telefone;
        private String Cidade;
        
        
        public Aluno (String Nome, String Matricula, String Telefone, String Cidade) {
            this.Nome = Nome;
            this.Matricula = Matricula;
            this.Telefone = Telefone;
            this.Cidade = Cidade;
        }
        

        public Aluno() {}


        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            this.Nome = nome;
        }
        public String getMatricula() {
            return Matricula;
        }
        public void setMatricula(String matricula) {
            this.Matricula = matricula;
        }
        public String getTelefone() {
            return Telefone;
        }
        public void setTelefone(String telefone) {
            this.Telefone = telefone;
        }
        public String getCidade() {
            return Cidade;
        }
        public void setCidade(String cidade) {
            Cidade = cidade;
        }
        
        public String getDados(){
            return  "Nome: " + this.Nome +
                    "\n Mat.: " + this.Matricula +
                    "\n Tel.: " + this.Telefone +
                    "\n Cidade: " + this.Cidade +
                    "\n";

        }
        
    }
