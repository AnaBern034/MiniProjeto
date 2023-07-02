package Controller;

import Model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    Scanner sc = new Scanner(System.in);
    Cliente cliente = new Cliente();
    List<Cliente> adicionarClientes = new ArrayList<>();
    TarefaController anotação = new TarefaController();
    public void CadastroCliente(Cliente cliente ){
        adicionarClientes.add(cliente);
    }
    public void LoginCliente(Cliente cliente){
        for (Cliente read: adicionarClientes) {
            if (read.equals(cliente.getEmail())&&read.equals(cliente.getSenha())){
                anotação.mostrarAnotação(cliente);
            }
        }
    }
    public void ProcurarClienteExistente(String email, String senha){
        for (Cliente rd: adicionarClientes){
            if (rd.getEmail().equals(email) && rd.getSenha().equals(senha)){
                System.out.println("Cliente existe");
                return;
            }
        }  System.out.println("Cliente não existe");
    }
}
