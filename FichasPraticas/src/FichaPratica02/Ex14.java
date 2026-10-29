package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;

        // Ler valores
        System.out.print("Insira o número A: ");
        a = input.nextInt();

        System.out.print("Insira o número B: ");
        b = input.nextInt();

        System.out.print("Insira o número C: ");
        c = input.nextInt();

        if (a < b && a < c) { // A ... ...
            if (b < c) {
                System.out.println(a + " " + b + " " + c); // A B C
            } else {
                System.out.println(a + " " + c + " " + b); // A C B
            }
        }

        if (b < a && b < c) { // B ... ...
            if (a < c) {
                System.out.println(b + " " + a + " " + c); // B A C
            } else {
                System.out.println(b + " " + c + " " + a); // B C A
            }
        }

        if (c < a && c < b) { // C ... ...
            if (a < b) {
                System.out.println(c + " " + a + " " + b); // C A B
            } else {
                System.out.println(c + " " + b + " " + a); // C B A
            }
        }
    }
}
