import View.EntradaUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntradaUsuario entrada = new EntradaUsuario();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite o numero que deseja \n" +
                    "1 - Cadastro\n" +
                    "2 - Login\n" +
                    "3 - Sair");
            Integer numeroOpcao = sc.nextInt();

            switch (numeroOpcao){
                case 1: entrada.CadastrarCliente();
                case 2: entrada.LoginCliente();
                case 3: System.exit(0);
            }
        }
    }
}
