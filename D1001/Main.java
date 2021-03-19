package D1001;

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
        int X;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B = ler.nextInt();
        X = A + B;

        System.out.println("X = " + X);

    }

}
