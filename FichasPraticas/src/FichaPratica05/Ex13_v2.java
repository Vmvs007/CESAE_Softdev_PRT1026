package FichaPratica05;

import java.util.Scanner;

public class Ex13_v2 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[4][4];

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Calcular o somatório da diagonal principal
        int somatorio = 0;

        for (int i = 0; i < matriz.length; i++) {
            somatorio += matriz[i][i];
        }

        System.out.println("Somatório da diagonal principal: " + somatorio);

    }
}
