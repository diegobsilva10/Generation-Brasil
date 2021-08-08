package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        // 3- Solicitar a idade de v�rias pessoas e imprimir:
        // Total de pessoas com menos de
        //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
        // idade for =-99.

        Scanner sc = new Scanner(System.in);
        int pessoa, totalmenos = 0, totalmais = 0;
        System.out.println("Para encerrar o programa digite -99");
        System.out.println("Digite sua idade");
        pessoa = sc.nextInt();

        while (pessoa != -99) {
            if (pessoa <= 21) {
                totalmenos++;
            } else if (pessoa >= 51) {
                totalmais++;
            }
            System.out.println("Digite sua idade");
            pessoa = sc.nextInt();
        }
        System.out.println("Total de pessoas menos de 21 anos" + totalmenos);
        System.out.println("Total de pessoas com mais de 50" + totalmais);


        sc.close();


    }

}
