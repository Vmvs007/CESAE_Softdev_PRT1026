package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, anterior, sucessor;

        // Ler valores
        System.out.print("Insira um número: ");
        numero = input.nextInt();

        anterior = numero - 5;
        sucessor = numero + 5;

        // Ciclo para imprimir os 5 anteriores
        while (anterior < numero) {
            System.out.println(anterior);
            anterior++;
        }

        // Ciclo para imprimir os 5 sucessores
        numero++;

        while (numero <= sucessor) {
            System.out.println(numero);
            numero++;
        }

    }
}
