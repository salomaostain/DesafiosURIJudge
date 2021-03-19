package D1035;

import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
class Main {

    public static void main(String args[]) {

        // scanner pra ler do teclado
        Scanner ler = new Scanner(System.in);

        // variáveis
        int A, B, C, D, CD, AB, RESTOA;

        // lendo as variáveis
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        // soma de variáveis
        CD = C + D;
        AB = A + B;

        // obtem o resto de A para ficar visualmente mais claro
        RESTOA = A % 2;

        // se B for maior que C e se D for maior do que A e se a soma de CD for maior que a soma de AB e se o resto de A não tiver resto então OK
        if (B > C && D > A && CD > AB && RESTOA == 0) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores nao aceitos");

        };

        // fecha o scanner
        ler.close();

    }

}
