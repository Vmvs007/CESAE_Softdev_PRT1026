package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, contador = 1, numeroAnterior, numeroAtual;
        boolean crescente = true;

        // Ler valores
        System.out.print("Quantos números deseja inserir: ");
        limite = input.nextInt();

        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        while (contador < limite) {
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior) {
                crescente = false;
            }

            numeroAnterior = numeroAtual;

            contador++;
        }

        if (crescente) { // crescente == true
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
