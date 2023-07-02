package Model;

public class Tarefa {
    private String anotação;
    private Cliente cliente;

    public Tarefa() {
    }
    public Tarefa(Tarefa anotação, Cliente cliente) {
    }

    public String getAnotação() {
        return anotação;
    }

    public void setAnotação(String anotação) {
        this.anotação = anotação;
    }

}
