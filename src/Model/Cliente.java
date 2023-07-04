package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {
        private UUID id;
        private String nome;
        private String email;
        private String senha;
        public List<Tarefa> tarefa = new ArrayList<>();
        public Cliente() {
            this.id=UUID.randomUUID();
        }

        public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id=UUID.randomUUID();
    }

        public Cliente(String nome, String email, String senha, List<Tarefa> tarefa) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.tarefa=tarefa;
            this.id= UUID.randomUUID();
        }

        public Cliente(String loginEmail, String loginSeha) {
            this.id=UUID.randomUUID();
            this.email=loginEmail;
            this.senha=loginSeha;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    public void adicionarAnotacaoCliente(Tarefa anotação){
        tarefa.add(anotação);
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }


}
