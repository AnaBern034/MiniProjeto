package View;

import Controller.ClienteController;
import Controller.TarefaController;
import Model.Cliente;
import Model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class EntradaUsuario {
    TarefaController adicionarAnotação = new TarefaController();
    private Cliente cliente = new Cliente();
    ClienteController cadastro = new ClienteController();

    public void CadastrarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite seu email: ");
        String email = sc.next();
        System.out.println("Digite sua senha: ");
        String senha = sc.next();

        Cliente cliente = new Cliente(nome,email,senha);

        cadastro.CadastroCliente(cliente);

        System.out.println("Deseja escrever alguma coisa\nsim\nnao");
        String opcao = sc.next();

        switch (opcao){
            case "sim": adicionarNotas();
            case "nao": return;
        }
    }
    public void adicionarNotas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas tarefas a fazer");
        String anotacao = sc.next();

        Tarefa tarefa = new Tarefa(anotacao);
        adicionarAnotação.adicionarNotasCliente(tarefa,cliente);
    }

    public void LoginCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o email");
        String loginEmail = sc.next();
        System.out.println("Digite sua senha");
        String loginSeha = sc.next();

        cadastro.ProcurarClienteExistente(loginEmail,loginSeha);
        mostrarTarefa(cliente);
    }
    public void mostrarTarefa(Cliente cliente){
        List<Tarefa> tarefas = adicionarAnotação.getTarefaCliente(cliente);
        if (tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada");
        }else {
            System.out.println("Anotações feitas"); {
                for (Tarefa tarefa : tarefas){
                    System.out.println(tarefa.getAnotação());
                }
            }
        }
    }
}
