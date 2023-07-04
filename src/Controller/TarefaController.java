package Controller;

import Model.Cliente;
import Model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class TarefaController extends Cliente {
    Scanner sc = new Scanner(System.in);
    Cliente cliente = new Cliente();
    public void adicionarNotasCliente(Tarefa anotação,Cliente cliente){
        cliente.adicionarAnotacaoCliente(anotação);
    }
    public List<Tarefa> getTarefaCliente(Cliente cliente) {
        return cliente.getTarefa();
    }

}
