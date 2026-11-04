package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
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
                fatorial = fatorial * i;
                i--;
            }

            System.out.println("Fatorial de " + n + ": " + fatorial);
        }
    }
}
