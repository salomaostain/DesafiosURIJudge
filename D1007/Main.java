package D1007;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

    }

}
