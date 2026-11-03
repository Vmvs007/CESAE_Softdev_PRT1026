package FichaPratica03;

import java.util.Scanner;

public class Ex08_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, anterior, sucessor;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        anterior = numero - 5;
        sucessor = numero + 5;

        while (anterior <= sucessor) {

            if (anterior != numero) {
                System.out.println(anterior);
            }

            anterior++;
        }

    }
}
