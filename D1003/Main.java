package D1003;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, SOMA;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B = ler.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }

}
