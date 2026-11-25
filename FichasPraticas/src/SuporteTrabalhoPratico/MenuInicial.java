package SuporteTrabalhoPratico;

import java.util.Scanner;

import static SuporteTrabalhoPratico.FuncoesAdmin.menuAdmin;
import static SuporteTrabalhoPratico.FuncoesCliente.menuCliente;

public class MenuInicial {

    public static void menuInicial() {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("MENU");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1: // Cliente
                    menuCliente();
                    break;

                case 2: // Admin

                    System.out.print("Username: ");
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    if (usernameInput.equals("quim") && passwordInput.equals("123")) {
                        menuAdmin();
                    } else {
                        System.out.println("Credenciais inválidas");
                    }

                    break;

                case 0:
                    System.out.println("Adeus :D");
                    break;

                default:
                    System.out.println("Inválido");
                    break;
            }

        } while (opcao != 0);

    }

    public static void main(String[] args) {
        menuInicial();
    }
}
