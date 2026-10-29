package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double nota1, nota2, nota3, mediaPonderada;

        System.out.println("Atenção que casas decimais usam vírgula (,)");

        // Ler valores
        System.out.print("Insira a 1º nota: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a 2º nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a 3º nota: ");
        nota3 = input.nextDouble();

        if (nota1 >= 0 && nota1 <= 20 && nota2 >= 0 && nota2 <= 20 && nota3 >= 0 && nota3 <= 20){

            // Calcular a media ponderada
            mediaPonderada = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4;
            // System.out.println("Média Ponderada: " + mediaPonderada);

            if (mediaPonderada >= 9.5) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }

        }else{
            System.out.println("Valores introduzidos são inválidos. As notas têm de ser um valor entre 0 - 20");
        }



    }
}
