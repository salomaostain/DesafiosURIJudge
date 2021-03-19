package D1002;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double A;
        double R;

        Scanner ler = new Scanner(System.in);
        R = ler.nextDouble();
        A = 3.14159 * Math.pow(R, 2);

        System.out.println("A=" + String.format("%.4f", A));

    }

}
