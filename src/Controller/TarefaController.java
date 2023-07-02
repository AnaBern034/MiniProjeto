package Controller;

import Model.Cliente;
import Model.Tarefa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TarefaController {
    Scanner sc = new Scanner(System.in);
    //  private List<Tarefa> tarefa = new ArrayList<>();
    HashMap<Cliente, Tarefa> tarefa = new HashMap<>();

    public void adicionarAnotacaoCliente(Tarefa anotação,Cliente cliente){
        if (cliente.equals(cliente.getEmail()) && cliente.equals(cliente.getSenha())){
            tarefa.put(cliente,anotação);
        }
    }
    public void mostrarAnotação(Cliente cliente){
        for (Map.Entry<Cliente,Tarefa> mostrarNotas: tarefa.entrySet()) {
            if (cliente.equals(cliente.getEmail()) && cliente.equals(cliente.getSenha())) {
                mostrarNotas.getValue();
            }
        }
    }
}
