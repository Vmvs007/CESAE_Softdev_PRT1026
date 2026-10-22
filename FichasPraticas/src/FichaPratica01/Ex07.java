package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco1, preco2, preco3, total, totalComDesconto;

        // Leitura dos valores
        System.out.print("Insira o preço do 1º produto: ");
        preco1 = input.nextDouble();

        System.out.print("Insira o preço do 2º produto: ");
        preco2 = input.nextDouble();

        System.out.print("Insira o preço do 3º produto: ");
        preco3 = input.nextDouble();

        // Calcular o total
        total = preco1 + preco2 + preco3;

        // Aplicar o desconto
        totalComDesconto = total * 0.9;

        // Apresentar o resultado
        System.out.println("Total com 10% de desconto: " + totalComDesconto + " €");

    }
}
