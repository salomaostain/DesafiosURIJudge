package D1080;

import java.util.Scanner;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) {

        // novo leitor
        Scanner ler = new Scanner(System.in);

        int maior = 0;
        int entrada = 0;
        int posicao = 0;

        // conta até 100
        for (int i = 1; i <= 100; i++) {

            // entrada
            entrada = ler.nextInt();

            // sempre verifica se a entrada é maior do que o maior anterior
            if (entrada > maior) {

                maior = entrada;
                posicao = i;

            };

        };

        // saida
        System.out.println(maior);
        System.out.println(posicao);

        // fecha o leitor
        ler.close();

    }

}
