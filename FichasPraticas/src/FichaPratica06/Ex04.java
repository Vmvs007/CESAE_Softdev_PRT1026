package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;


public class Ex04 {

    public static void imprimirMenu() {
        System.out.println("\n-+-+-+-+-+-+- Programa de Analisar Números -+-+-+-+-+-+-");
        System.out.println("1. Par ou Impar");
        System.out.println("2. Positivo ou Negativo");
        System.out.println("3. Primo");
        System.out.println("4. Perfeito");
        System.out.println("5. Triangular");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao, numero;

        System.out.print("Insira um número para ser analisado: ");
        numero = input.nextInt();

        do {

            imprimirMenu();

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }

        } while (opcao != 0);

    }
}
