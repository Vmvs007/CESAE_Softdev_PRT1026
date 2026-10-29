package FichaPratica02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler valores
        System.out.print("Insira um número: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

    }

}
