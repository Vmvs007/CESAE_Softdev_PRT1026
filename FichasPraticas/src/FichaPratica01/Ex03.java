package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int ladoA, ladoB, perimetro, area;

        // Ler valores
        System.out.print("Insira a largura: ");
        ladoA = input.nextInt();

        System.out.print("Insira a altura: ");
        ladoB = input.nextInt();

        // Calcular perimetro
        perimetro = ladoA + ladoA + ladoB + ladoB;

        // Calcular area
        area = ladoA * ladoB;

        // Apresentar os resultados
        System.out.println("Perímetro: "+perimetro);
        System.out.println("Área: "+area);
    }
}
