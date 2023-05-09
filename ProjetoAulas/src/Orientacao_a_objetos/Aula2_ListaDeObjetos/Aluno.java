package Orientacao_a_objetos.Aula2_ListaDeObjetos;

    public class Aluno{
        private String Nome;
        private String Matricula;
        private String Telefone;
        
        
        public Aluno (String Nome, String Matricula, String Telefone) {
            this.Nome = Nome;
            this.Matricula = Matricula;
            this.Telefone = Telefone;
        }
        

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

        public String getDados(){
            return  "Nome: " + this.Nome +
                    "\n Mat.: " + this.Matricula +
                    "\n Tel.: " + this.Telefone;
        }
        
    }
