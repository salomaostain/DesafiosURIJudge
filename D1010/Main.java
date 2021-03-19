package D1010;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int codigo_1, numero_peca_1, codigo_2, numero_peca_2;
        double valor_1, valor_2, total;

        Scanner ler = new Scanner(System.in);

        codigo_1 = ler.nextInt();
        numero_peca_1 = ler.nextInt();
        valor_1 = ler.nextDouble();

        codigo_2 = ler.nextInt();
        numero_peca_2 = ler.nextInt();
        valor_2 = ler.nextDouble();

        total = (numero_peca_1 * valor_1) + (numero_peca_2 * valor_2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

    }

}
