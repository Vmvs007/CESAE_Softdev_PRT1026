package FichaPratica01;

import java.util.Scanner;

public class Ex02_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, resultado;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Calcular resultados
        resultado = num1 + num2;
        System.out.println("Soma: " + resultado);

        resultado = num1 - num2;
        System.out.println("Subtração: " + resultado);

        resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);

        resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);

    }
}
