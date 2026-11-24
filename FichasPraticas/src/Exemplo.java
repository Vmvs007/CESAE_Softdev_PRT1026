import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[5];

        // Leitura dos valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int consulta;

        System.out.print("Qual indíce quer consultar: ");
        consulta= input.nextInt();


        try{
            System.out.println(vetor[consulta]);
            System.out.println("Correu tudo bem");
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Não podes consultar um index que não seja válido: "+consulta);
        }

        System.out.println("--- FIM ---");


    }
}
