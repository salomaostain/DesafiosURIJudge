package D1038;

import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // permite pegar ponto no shell
        Locale.setDefault(Locale.US);

        // leitor
        Scanner ler = new Scanner(System.in);

        // variáveis
        int codigo, quantidade;
        double[] preco;

        // ler variáveis
        codigo = ler.nextInt();
        quantidade = ler.nextInt();

        // popula o array
        preco = new double[6];
        preco[1] = 4.0;
        preco[2] = 4.5;
        preco[3] = 5.0;
        preco[4] = 2.0;
        preco[5] = 1.5;

        // total
        double total = preco[codigo] * quantidade;

        // saida
        System.out.println("Total: R$ " + String.format("%.2f", total));

        // fecha o leitor
        ler.close();

    }

}
