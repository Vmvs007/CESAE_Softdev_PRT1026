package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, resultado;
        String operacao;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        System.out.print("Operação pretendida ( + - * / ): ");
        operacao = input.next();

        switch (operacao) {

            case "+":
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;

            case "-":
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;

            case "*":
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;

            case "/":
                resultado = num1 / num2;
                System.out.println("Divisão: " + resultado);
                break;

            default:
                System.out.println("Operação inválida: "+operacao);

        }

    }
}
