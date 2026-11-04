package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        for (int divisor = 1; divisor <= numero; divisor++) {

            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
        }

    }
}
