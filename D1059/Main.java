package D1059;

import java.io.IOException;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // variáveis
        int a, b;

        // contador
        a = 2;

        // conta até 100
        for (a = a; a <= 100; a++) {

            // resto da divisão
            b = a % 2;

            // se for igual a zero então exiba a mensagem
            if (b == 0) {

                System.out.println(a);

            };

        };

    }

}
