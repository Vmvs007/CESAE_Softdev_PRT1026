package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero, limite, salto;

        // Ler valores
        numero = 0; // Início

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        System.out.print("Insira o salto: ");
        salto = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero += salto; // numero = numero + salto;
        }

    }
}
