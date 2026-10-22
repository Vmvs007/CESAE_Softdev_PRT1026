package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int minutosLidos, segundosLidos, totalSegundosAlbum = 0;

        // Ler duração das musicas
        System.out.print("Insira os minutos da música 1: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 1: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("Insira os minutos da música 2: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 2: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("Insira os minutos da música 3: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 3: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("Insira os minutos da música 4: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 4: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("Insira os minutos da música 5: ");
        minutosLidos = input.nextInt();

        System.out.print("Insira os segundos da música 5: ");
        segundosLidos = input.nextInt();

        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        // ___________________________________________________________________________

        System.out.println("Total de Segundos do Álbum: " + totalSegundosAlbum + " s.");

        int horas, minutos, segundos;

        horas = totalSegundosAlbum / 3600;

        totalSegundosAlbum = totalSegundosAlbum % 3600;

        minutos = totalSegundosAlbum / 60;

        totalSegundosAlbum = totalSegundosAlbum % 60;

        segundos = totalSegundosAlbum;

        System.out.println("Duração total do álbum: " + horas + " h | " + minutos + " m | " + segundos + " s");

    }
}
