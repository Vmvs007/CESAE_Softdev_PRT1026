package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, limite;

        // Ler valores
        System.out.print("Insira o início: ");
        numero = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {
            if (numero % 5 == 0) {
                System.out.println(numero);
            }

            numero ++;
        }
    }
}
