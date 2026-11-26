package SuporteTrabalhoPratico;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

        Random rd = new Random();

        int a = rd.nextInt();

        int b = rd.nextInt(20);

        int c = rd.nextInt(70,80);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
