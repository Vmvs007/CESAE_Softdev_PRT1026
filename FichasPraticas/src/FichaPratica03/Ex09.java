package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 0, somatorio = 1, contador = -1, media;

        while (numero != -1) {
            System.out.print("Insira um número: ");
            numero = input.nextInt();

            somatorio = somatorio + numero;
            contador++;
        }

        System.out.println("Somatório: " + somatorio);
        System.out.println("Contador: " + contador);

        media = somatorio / contador;

        System.out.println("Média: " + media);

    }
}
