package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler valores
        System.out.print("Insira um número: ");
        num1 = input.nextInt();

        System.out.print("Insira outro número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num1 + " " + num2);
        }
    }
}
