package FichaPratica04;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, triangulares = 0;
        boolean numeroTriangular = false;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int i = 1; triangulares < numero; i++) {
            triangulares += i;
            System.out.println(triangulares);

            if (triangulares == numero) {
                // O meu número é triangular
                numeroTriangular = true;

            }
        }

        if (numeroTriangular) { // numeroTriangular == true
            System.out.println("Triangular");
        } else {
            System.out.println("Não triangular");
        }
    }
}
