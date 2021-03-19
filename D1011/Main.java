package D1011;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double raio, calculo, pi;

        Scanner ler = new Scanner(System.in);

        pi = 3.14159;
        raio = ler.nextDouble();

        calculo = (4 / 3.0) * pi * Math.pow(raio, 3);

        System.out.println(String.format("VOLUME = %.3f", calculo));

    }

}
