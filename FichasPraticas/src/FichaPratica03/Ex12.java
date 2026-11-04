package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero = 0, intervalo_00_25 = 0, intervalo_26_50 = 0, intervalo_51_75 = 0, intervalo_76_100 = 0;

        while (numero >= 0) {
            System.out.print("Insira o número: ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                intervalo_00_25++;
            }

            if (numero >= 26 && numero <= 50) {
                intervalo_26_50++;
            }

            if (numero >= 51 && numero <= 75) {
                intervalo_51_75++;
            }

            if (numero >= 76 && numero <= 100) {
                intervalo_76_100++;
            }
        }

        System.out.println(" [00,25]: " + intervalo_00_25);
        System.out.println(" [26,50]: " + intervalo_26_50);
        System.out.println(" [51,75]: " + intervalo_51_75);
        System.out.println("[76,100]: " + intervalo_76_100);
    }
}
