package D1066;

import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) {

        // scanner
        Scanner ler = new Scanner(System.in);

        // variáveis primitivas
        int valor, par = 0, impar = 0, positivo = 0, negativo = 0;

        // listando até 5
        for (int i = 0; i < 5; i++) {

            valor = ler.nextInt();

            // pares
            if (valor % 2 == 0) {

                par++;

            } else {

                impar++;

            };

            // positivos
            if (valor > 0) {

                positivo++;

            };

            if (valor < 0) {

                negativo++;

            };

        };

        // resultado
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

    }

}
