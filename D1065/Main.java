package D1065;

import java.io.IOException;
import java.text.DecimalFormat;
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

        DecimalFormat decimal = new DecimalFormat("0.0");

        // variáveis
        double i = 1;
        double s;
        int contador = 0;

        for (i = i; i <= 5; i++) {

            s = ler.nextDouble();

            if (s % 2 == 0) {

                contador++;

            };

        };

        System.out.println(contador + " valores pares");

        // fecha leitor
        ler.close();

    }

}
