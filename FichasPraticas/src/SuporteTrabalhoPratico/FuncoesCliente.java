package SuporteTrabalhoPratico;

import java.util.Scanner;

public class FuncoesCliente {

    public static void menuCliente(){

        Scanner input = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("MENU CLIENTE");
            System.out.println("1. Ver cartaz");
            System.out.println("2. Lugares disponiveis");
            System.out.println("3. Quiz");
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
