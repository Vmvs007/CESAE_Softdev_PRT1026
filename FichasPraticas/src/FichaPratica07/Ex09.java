package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.BibliotecaFicheiros.contarLinhasFicheiro;

public class Ex09 {

    public static int contarColunasFicheiro(String caminho, String separador) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        String cabecalho = sc.nextLine();
        String[] cabecalhoSeparado = cabecalho.split(separador);

        return cabecalhoSeparado.length;
    }

    /**
     * Função que lê o conteúdo de um ficheiro para uma matriz, excluindo cabeçalho
     *
     * @param caminho Caminho para o ficheiro
     * @return Matriz (String) c/ o conteúdo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminho, String separador) throws FileNotFoundException {

        int numeroLinhasFicheiro = contarLinhasFicheiro(caminho);
        int numeroColunasFicheiro = contarColunasFicheiro(caminho, separador);

        String[][] matrizMusicas = new String[numeroLinhasFicheiro - 1][numeroColunasFicheiro];

        // System.out.println("Linhas: "+matrizMusicas.length);
        // System.out.println("Colunas: "+matrizMusicas[0].length);

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        // Avançar cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(separador);

            for (int i = 0; i < linhaSeparada.length; i++) {
                matrizMusicas[linhaPreencher][i] = linhaSeparada[i];
            }

            linhaPreencher++;
        }

        return matrizMusicas;
    }

    /**
     * Função que imprime uma matriz na consola
     *
     * @param matriz Matriz a ser impressa
     */
    public static void imprimirMatriz(String[][] matriz) {

        // Impressão da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t | ");
            }
            System.out.println();
        }
    }

    public static void pesquisarMusicasGenero(String[][] matriz, String genero) {

        System.out.println("Músicas de " + genero);

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][2].equals(genero)) {
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }
        }
    }

    public static void menu(String[][] matrizMusicas) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n-+-+-+-+-+-+-+-+- PROGRAMA DE ANÁLISE DE PLAYLIST -+-+-+-+-+-+-+-+-\n");
            System.out.println("1. Pesquisa por Género");
            System.out.println("2. Pesquisa por Artista");
            System.out.println("3. Música mais longa");
            System.out.println("4. Músicas com duração superior");
            System.out.println("5. Número de músicas");
            System.out.println("0. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÉNERO -+-+-+-+-");
                    System.out.print("Género a pesquisar (ex: Rock, Pop, Folk): ");
                    input.nextLine(); // Limpar o buffer
                    String generoPesquisar = input.nextLine();

                    pesquisarMusicasGenero(matrizMusicas, generoPesquisar);
                    break;

                case 2: // Pesquisa por Artista
                    System.out.println("\n-+-+-+-+- PESQUISA POR ARTISTA -+-+-+-+-");
                    break;

                case 3: // Música mais longa
                    System.out.println("\n-+-+-+-+- MÚSICA MAIS LONGA -+-+-+-+-");
                    break;

                case 4: // Músicas com duração superior
                    System.out.println("\n-+-+-+-+- MÚSICAS COM DURAÇÃO SUPERIOR A -+-+-+-+-");
                    break;

                case 5: // Número de músicas
                    System.out.println("\n-+-+-+-+- NÚMERO DE MÚSICAS -+-+-+-+-");
                    System.out.println(matrizMusicas.length);
                    break;

                case 0: // Pesquisa por Género
                    System.out.println("\n-+-+-+-+- ATÉ LOGO -+-+-+-+-");
                    break;

                default:
                    System.out.println("\nOpção Inválida: " + opcao);
                    break;

            }

        } while (opcao != 0);

    }


    public static void main(String[] args) throws FileNotFoundException {
        String[][] matrizMusicas = lerFicheiroParaMatriz("FicheirosFicha07/exercicio_09.csv",",");
        menu(matrizMusicas);
    }
}
