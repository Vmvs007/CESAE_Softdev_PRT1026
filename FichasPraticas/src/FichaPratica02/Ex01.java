package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Leitura dos valores
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        }else{
            System.out.println("Maior: " + num2);
        }

    }
}
