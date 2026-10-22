package FichaPratica01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int num1, num2, soma;

        // Ler valores do utilizador
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        // Calcular a soma
        soma = num1 + num2;

        // Apresentar o resultado
        System.out.println("O resultado da soma é: " + soma);

    }

}
