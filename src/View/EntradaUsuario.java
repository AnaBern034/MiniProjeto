package View;

import Controller.ClienteController;
import Controller.TarefaController;
import Model.Cliente;
import Model.Tarefa;

import java.util.Scanner;

public class EntradaUsuario {
    TarefaController adicionarAnotação = new TarefaController();
    Tarefa anotação = new Tarefa();
    ClienteController cadastro = new ClienteController();
    Cliente cliente = new Cliente();
    Scanner sc = new Scanner(System.in);

    public void CadastrarCliente(){
        System.out.println("Digite seu nome: ");
        cliente.setNome(sc.next());
        System.out.println("Digite seu email: ");
        cliente.setEmail(sc.next());
        System.out.println("Digite sua senha: ");
        cliente.setSenha(sc.next());

        cadastro.CadastroCliente(cliente);

        System.out.println("Digite as suas tarefas a fazer");
        anotação.setAnotação(sc.next());

        Tarefa notas = new Tarefa(anotação,cliente);

        adicionarAnotação.adicionarAnotacaoCliente(notas,cliente);

    }

    public void LoginCliente(){
        System.out.println("Digite o email");
        String loginEmail = sc.next();
        System.out.println("Digite sua senha");
        String loginSeha = sc.next();

        cadastro.ProcurarClienteExistente(loginEmail,loginSeha);
        adicionarAnotação.mostrarAnotação(cliente);
    }
}
