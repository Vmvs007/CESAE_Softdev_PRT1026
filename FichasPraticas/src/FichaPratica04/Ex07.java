package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        boolean primo = true;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int divisor = 2; divisor < numero; divisor++) {

            if (numero % divisor == 0) {
                // Encontrou um divisor - não é primo
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
