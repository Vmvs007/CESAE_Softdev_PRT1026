package FichaPratica03;

import java.util.Scanner;

public class Ex15_Desafio {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int n;

        // Ler valores
        System.out.print("Introduza um número: ");
        n = input.nextInt();

        if (n < 0) {
            System.out.println("O número deve ser não-negativo.");
        } else {
            long fatorial = 1;
            int i = n;

            while (i > 1) {
                long resultado = 0;
                int k = 0;

                while (k < i) {
                    resultado += fatorial;
                    k++;
                }

                fatorial = resultado;
                i--;
            }

            System.out.println("Fatorial de " + n + ": " + fatorial);
        }

    }
}

