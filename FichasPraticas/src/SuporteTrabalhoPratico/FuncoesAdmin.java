package SuporteTrabalhoPratico;

import java.util.Scanner;

public class FuncoesAdmin {

    public static void menuAdmin(){

        Scanner input = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("MENU ADMIN");
            System.out.println("1. Consultar ficheiros");
            System.out.println("2. Vendas");
            System.out.println("3. Reset lotações");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcao= input.nextInt();

            switch (opcao){

                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    System.out.println("Voltar...");
                    break;

                default:
                    System.out.println("Inválido");
                    break;
            }

        }while (opcao!=0);

    }
}
