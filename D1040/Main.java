package D1040;

import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;
import java.text.DecimalFormat;

/* 
 * Autor: Salomão Francisco da Silva
 * Contato: salomao@taimber.com
 * Site: salomaodev.com
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // permite a entrada com ponto
        Locale.setDefault(Locale.US);

        // scanner
        Scanner ler = new Scanner(System.in);

        // notas
        float n1, n2, n3, n4, media, notaexame;
        DecimalFormat decimal = new DecimalFormat("0.0");

        // lendo as notas
        n1 = ler.nextFloat();
        n2 = ler.nextFloat();
        n3 = ler.nextFloat();
        n4 = ler.nextFloat();

        // calculando a média
        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
        System.out.println("Media: " + decimal.format(media));

        // valida a media
        if (media >= 7) {

            System.out.println("Aluno aprovado.");

        } else if (media < 5) {

            System.out.println("Aluno reprovado.");

        } else {

            System.out.println("Aluno em exame.");
            notaexame = ler.nextFloat();
            System.out.println("Nota do exame: " + decimal.format(notaexame));

            if (notaexame > 5.0) {

                System.out.println("Aluno aprovado.");

            } else {
                System.out.println("Aluno reprovado.");

            };

            System.out.println("Media final: " + decimal.format(((notaexame + media) / 2)));

        };

        // fecha o leitor
        ler.close();

    }

}
