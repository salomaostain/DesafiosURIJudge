package D1036;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

/*
 Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 
 */

 /* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String args[]) throws IOException {

        // permite pegar ponto no shell
        Locale.setDefault(Locale.US);

        // novo scanner
        Scanner ler = new Scanner(System.in);

        // variáveis
        double a, b, c, delta, r1, r2;
        DecimalFormat formato = new DecimalFormat("0.00000");

        // lendo do teclado
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        // calcula delta
        delta = Math.pow(b, 2) - 4 * a * c;;

        // se a for menor ou igual a zero, ou delta for menor igual a zero então é impossível calcular
        if (a <= 0 | delta <= 0) {

            System.out.println("Impossivel calcular");

        } else {

            delta = Math.sqrt(delta);

            // calcula as raizes
            r1 = (-b + delta) / (2 * a);
            r2 = (-b - delta) / (2 * a);

            // saída
            System.out.println("R1 = " + formato.format(r1));
            System.out.println("R2 = " + formato.format(r2));

        };

        // fecha o scanner
        ler.close();

    }

}
