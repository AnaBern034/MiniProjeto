package Controller;

import Model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    List<Cliente> adicionarClientes = new ArrayList<>();
    TarefaController anotação = new TarefaController();
    public void CadastroCliente(Cliente cliente ){
        adicionarClientes.add(cliente);
    }

    public Cliente ProcurarClienteExistente(String email, String senha){
        for (Cliente rd: adicionarClientes){
            if (rd.getEmail().equals(email) && rd.getSenha().equals(senha)){
                return rd;
            }
        }System.out.println("Cliente não existe");
        return null;
    }

}
