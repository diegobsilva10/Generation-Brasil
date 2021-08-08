package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg, min, segundos;
        double horas;

        System.out.println("\nDigite a duracao do evento em segundos");
        seg = sc.nextInt();

        horas = seg / 3600;
        min = (seg % 3600) / 60;
        segundos = (seg % 3600) % 60;

        System.out.printf("Horas: %2.0f ", horas);
        System.out.println("\nMinutos: " + min + "\nSegundos: " + segundos);


        sc.close();

    }

}
