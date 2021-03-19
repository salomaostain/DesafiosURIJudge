package D1009;

import java.io.IOException;
import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        double SALARIO, VENDAS, TOTAL;

        Scanner ler = new Scanner(System.in);

        String NOME = new String(ler.next());

        SALARIO = ler.nextDouble();
        VENDAS = ler.nextDouble();
        TOTAL = ((VENDAS * 15) / 100) + SALARIO;

        System.out.println("TOTAL = R$ " + String.format("%.2f", TOTAL));

    }

}
