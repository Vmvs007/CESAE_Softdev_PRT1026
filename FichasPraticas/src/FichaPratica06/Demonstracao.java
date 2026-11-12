package FichaPratica06;

import java.util.Scanner;

public class Demonstracao {


    public static int moduloDiferencaInteira(int a, int b) {

        int resultado;

        if (a > b) {
            resultado = a - b;
        } else {
            resultado = b - a;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2, res;

        // Ler valores do utilizador
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        res = moduloDiferencaInteira(num1, num2);
        System.out.println("Resultado: " + res);
    }
}
