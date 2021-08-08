package exercicios;

import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args) {
        // 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
        // final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
        // 0(zero).(DO...WHILE)

        Scanner sc = new Scanner(System.in);
        int x, media = 0, cont = 0, soma = 0;

        do {
            System.out.println("Digte um n�mero: ");
            x = sc.nextInt();
            if (x % 3 == 0) {
                cont++;
                soma += x;
                System.out.println(media);
            }

        } while (x != 0);

        media = soma / cont;
        System.out.println("m�dia: " + media);

        sc.close();
    }
}
