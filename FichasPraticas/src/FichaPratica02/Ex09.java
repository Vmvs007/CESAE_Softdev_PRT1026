package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;

        // Ler valores
        System.out.print("Insira o 1º valor: ");
        a = input.nextInt();

        System.out.print("Insira o 2º valor: ");
        b = input.nextInt();

        System.out.print("Insira o 3º valor: ");
        c = input.nextInt();

        // Apresentar o menor dos 3
        if (a < b && a < c) {
            System.out.println("Menor: " + a);
        }

        if (b < a && b < c) {
            System.out.println("Menor: " + b);
        }

        if (c < a && c < b) {
            System.out.println("Menor: " + c);
        }

    }
}
