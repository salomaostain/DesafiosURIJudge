package D1064;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        // ler
        Scanner ler = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("0.0");

        // variáveis
        double i = 1;
        double s;
        int contador = 0;
        double media = 0;

        for (i = i; i <= 6; i++) {

            s = ler.nextDouble();

            if (s > 0) {

                contador++;
                media += s;

            };

        };

        System.out.println(contador + " valores positivos");
        System.out.println(decimal.format(media / contador));

        // fecha leitor
        ler.close();

    }

}
