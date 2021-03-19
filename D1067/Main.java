package D1067;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int A, B;

        A = ler.nextInt();

        for (B = 1; B <= A; B++) {

            if (B % 2 == 1) {

                System.out.println(B);

            };

        };

    }

}
