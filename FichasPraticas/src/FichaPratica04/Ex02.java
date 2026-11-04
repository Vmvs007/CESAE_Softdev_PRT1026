package FichaPratica04;

public class Ex02 {
    public static void main(String[] args) {

        int somatorio = 0;

        for (int i = 11; i <= 51; i += 2) {
            System.out.println(i);
            somatorio += i; // somatorio = somatorio + i
        }

        System.out.println("Somatório: " + somatorio);
    }
}
