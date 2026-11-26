package SuporteTrabalhoPratico;

import java.io.FileNotFoundException;
import java.util.Random;

import static FichaPratica07.Ex09.imprimirMatriz;
import static FichaPratica07.Ex09.lerFicheiroParaMatriz;

public class Quiz {
    public static void main(String[] args) throws FileNotFoundException {

        Random rd = new Random();

        String[][] todasPerguntas = lerFicheiroParaMatriz("GrandeEcra_Ficheiros/GrandeEcra_Quiz.csv", ";");
        // imprimirMatriz(todasPerguntas);

        int indexSorteado = rd.nextInt(todasPerguntas.length);
        System.out.println("Pergunta com index: " + indexSorteado);

        System.out.println("========================== PERGUNTA DE CINEMA ==========================");
        System.out.println(todasPerguntas[indexSorteado][0]);

        System.out.println("1. "+todasPerguntas[indexSorteado][1]);
        System.out.println("2. "+todasPerguntas[indexSorteado][2]);
        System.out.println("3. "+todasPerguntas[indexSorteado][3]);
        System.out.println("4. "+todasPerguntas[indexSorteado][4]);

        System.out.print("Resposta: ");

    }
}
