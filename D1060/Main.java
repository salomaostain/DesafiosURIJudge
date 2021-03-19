package D1060;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // ler
        Scanner ler = new Scanner(System.in);

        // variáveis
        double i = 1;
        double s;
        int contador = 0;

        for (i = i; i <= 6; i++) {

            s = ler.nextDouble();

            if (s > 0) {

                contador++;

            };

        };

        System.out.println(contador + " valores positivos");

        // fecha leitor
        ler.close();

    }

}
