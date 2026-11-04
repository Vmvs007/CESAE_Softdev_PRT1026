package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numeroSecreto, palpite, contadorTentativas = 0;

        // Ler numero do JOGADOR 1
        System.out.print("[JOGADOR 1] Insira o número secreto (0-100): ");
        numeroSecreto = input.nextInt();

        // "Limpar a consola"
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        do {

            // Palpite JOGADOR 2
            System.out.print("\n[JOGADOR 2] Tenta acertar no número secreto: ");
            palpite = input.nextInt();

            contadorTentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O teu palpite foi muito baixo. Tenta subir um pouco.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O teu palpite foi muito alto. Tenta baixar um pouco.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("\n\nGANHASTE! Acertaste no número secreto: " + numeroSecreto);
        System.out.println("Foram necessárias "+contadorTentativas+" tentativas!");

    }
}
