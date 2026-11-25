package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.copiarFicheiro;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        copiarFicheiro("FicheirosFicha07/exercicio_03.txt","FicheirosFicha07/exercicio_03_copia.txt");

    }
}
