package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Criar variáveis
        int[][] matriz = new int[5][5];
        int somatorio = 0;

        // Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Calcular a soma de todos os elementos
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somatorio += matriz[linha][coluna];
            }
        }

        System.out.println("Soma de todos os elementos: " + somatorio);


    }
}