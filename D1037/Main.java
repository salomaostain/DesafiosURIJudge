package D1037;

import java.util.Scanner;
import java.io.IOException;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // novo scaner
        Scanner ler = new Scanner(System.in);

        // variáveis
        double entrada = ler.nextDouble();

        // condicional
        if (entrada >= 0 & entrada <= 25) {

            System.out.println("Intervalo [0,25]");

        } else if (entrada > 25 & entrada <= 50) {

            System.out.println("Intervalo (25,50]");

        } else if (entrada > 50 & entrada <= 75) {

            System.out.println("Intervalo (50,75]");

        } else if (entrada > 75 & entrada <= 100) {

            System.out.println("Intervalo (75,100]");

        } else {

            System.out.println("Fora de intervalo");

        };

        // fecha o scanner
        ler.close();

    }

}
