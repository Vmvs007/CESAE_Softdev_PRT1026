package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {

        double totalVendas = 0;

        File ficheiro = new File("FicheirosFicha07/exercicio_08.csv");
        Scanner sc = new Scanner(ficheiro);

        // Avançar o cabeçalho
        sc.nextLine();

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(";");

            totalVendas += Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);
        }

        System.out.println("Total de Vendas: " + totalVendas + " €");
    }
}
