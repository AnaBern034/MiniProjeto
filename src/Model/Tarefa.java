package Model;

public class Tarefa{
    private String anotação;
    private Long id;
    Cliente cliente = new Cliente();

    public Tarefa() {
    }

    public Tarefa(String anotação) {
        this.anotação = anotação;
    }

    public Tarefa(String anotacao, Cliente cliente) {
        this.anotação = anotacao;
        this.cliente = cliente;
    }

    public String getAnotação() {
        return anotação;
    }

    public void setAnotação(String anotação) {
        this.anotação = anotação;
    }

}
