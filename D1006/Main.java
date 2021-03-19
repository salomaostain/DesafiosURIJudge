package D1006;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double A, B, C, MEDIA;

        Scanner ler = new Scanner(System.in);

        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.println("MEDIA = " + String.format("%.1f", MEDIA));

    }

}
