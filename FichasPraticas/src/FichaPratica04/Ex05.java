package FichaPratica04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        do {

            System.out.println("\n-+-+-+-+-+-+- MENU -+-+-+-+-+-+-\n");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n-+-+-+-+-+-+- CRIAR -+-+-+-+-+-+-\n");
                    break;

                case 2:
                    System.out.println("\n-+-+-+-+-+-+- ATUALIZAR -+-+-+-+-+-+-\n");
                    break;

                case 3:
                    System.out.println("\n-+-+-+-+-+-+- ELIMINAR -+-+-+-+-+-+-\n");
                    break;

                case 0:
                    System.out.println("\n-+-+-+-+-+-+- SAIR -+-+-+-+-+-+-\n");
                    break;

                default:
                    System.out.println("\nOpção Inválida: " + opcao + "\n");
                    break;
            }

        } while (opcao != 0);

    }
}
