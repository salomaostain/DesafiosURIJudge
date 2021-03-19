package D1008;

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
        double C;

        Scanner ler = new Scanner(System.in);

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextDouble();

        System.out.println("NUMBER = " + A);
        System.out.println("SALARY = U$ " + String.format("%.2f", B * C));

    }

}
