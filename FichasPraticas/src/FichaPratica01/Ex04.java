package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area;

        // Ler valores
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

        // Calcular a area
        area = 3.14 * raio * raio;

        // Apresentar o resultado
        System.out.println("Área da Circunferência: " + area);
    }
}
