package D1005;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double A, B, MEDIA;

        Scanner ler = new Scanner(System.in);

        A = ler.nextDouble();
        B = ler.nextDouble();

        MEDIA = ((A * 3.5) + B * 7.5) / (3.5 + 7.5);
        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));

    }

}
