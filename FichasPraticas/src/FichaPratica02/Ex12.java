package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int opcao;

        // Apresentar menu
        System.out.println("-+-+-+-+-+- MENU -+-+-+-+-+-");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        System.out.print("Opção: ");
        opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("\n-+-+-+-+-+- CRIAR -+-+-+-+-+-");
                break;

            case 2:
                System.out.println("\n-+-+-+-+-+- ATUALIZAR -+-+-+-+-+-");
                break;

            case 3:
                System.out.println("\n-+-+-+-+-+- ELIMINAR -+-+-+-+-+-");
                break;

            case 4:
                break;

            default:
                System.out.println("\n-+-+-+-+-+- OPÇÃO INVÁLIDA -+-+-+-+-+-");
                break;
        }
    }
}
