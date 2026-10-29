package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;
        String escolha;

        // Ler valores
        System.out.print("Insira o número A: ");
        a = input.nextInt();

        System.out.print("Insira o número B: ");
        b = input.nextInt();

        System.out.print("Insira o número C: ");
        c = input.nextInt();

        System.out.print("(C) crescente ou (D) decrescente: ");
        escolha = input.next();

        switch (escolha) {
            case "C":
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
                break;

            case "D":
                if (a < b && a < c) {
                    if (b < c) {
                        System.out.println(c + " " + b + " " + a);
                    } else {
                        System.out.println(b + " " + c + " " + a);
                    }
                }

                if (b < a && b < c) {
                    if (a < c) {
                        System.out.println(c + " " + a + " " + b);
                    } else {
                        System.out.println(a + " " + c + " " + b);
                    }
                }

                if (c < a && c < b) {
                    if (a < b) {
                        System.out.println(b + " " + a + " " + c);
                    } else {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
                break;

            default:
                System.out.println("Operação não reconhecida: " + escolha);
        }

    }
}
