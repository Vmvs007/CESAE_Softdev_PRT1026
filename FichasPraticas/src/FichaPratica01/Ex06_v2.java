package FichaPratica01;

import java.util.Scanner;

public class Ex06_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int valor1, valor2;

        // Ler valores
        System.out.print("Insira o Valor1: ");
        valor1 = input.nextInt();

        System.out.print("Insira o Valor2: ");
        valor2 = input.nextInt();

        // Trocar os valores
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentar os valores trocados
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);
    }
}
