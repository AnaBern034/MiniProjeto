package Teste;

import Controller.ClienteController;
import Model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

public class Testar {
    @Test
    public void testarClienteExistente(){
        Cliente clienteExistente = new Cliente("ana","email","123");
        ClienteController clienteController = new ClienteController();

        clienteController.CadastroCliente(clienteExistente);

        Cliente encontrarCliente = clienteController.ProcurarClienteExistente("email","123");
        Assertions.assertNotNull(encontrarCliente);
        // BeforeAll
    }
}
