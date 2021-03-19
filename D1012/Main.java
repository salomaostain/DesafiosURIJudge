package D1012;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        float a, b, c;
        double pi = 3.14159, triangulo, circulo, trapezio, quadrado, retangulo;

        Scanner ler = new Scanner(System.in);

        a = ler.nextFloat();
        b = ler.nextFloat();
        c = ler.nextFloat();

        System.out.println("TRIANGULO: " + String.format("%.3f", a * c / 2));
        System.out.println("CIRCULO: " + String.format("%.3f", c * c * pi));
        System.out.println("TRAPEZIO: " + String.format("%.3f", (a + b) * c / 2));
        System.out.println("QUADRADO: " + String.format("%.3f", b * b));
        System.out.println("RETANGULO: " + String.format("%.3f", a * b));

    }

}
