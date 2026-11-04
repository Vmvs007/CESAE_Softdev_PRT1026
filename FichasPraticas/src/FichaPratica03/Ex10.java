package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, numero = 2;

        // Ler valores
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero += 2; // numero = numero + 2;
        }
    }
}
