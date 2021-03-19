package D1017;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double tempo, hora, km_litro = 12;
        double resultado;

        Scanner ler = new Scanner(System.in);

        tempo = ler.nextInt();
        hora = ler.nextInt();
        resultado = (tempo * hora) / km_litro;

        System.out.println(String.format("%.3f", resultado));

    }

}
