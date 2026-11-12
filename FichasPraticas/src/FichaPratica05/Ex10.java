package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[5][3];
        int numeroPesquisar, contador = 0;

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        System.out.print("Insira um número para pesquisar: ");
        numeroPesquisar = input.nextInt();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if (matriz[linha][coluna] == numeroPesquisar) {
                    contador++;
                }
            }
        }

        System.out.println("Há " + contador + " posições na matriz com o número: " + numeroPesquisar);

    }
}