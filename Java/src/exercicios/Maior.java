package exercicios;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("\nDigite n�mero 1 : ");
        numero1 = sc.nextInt();
        System.out.println("\nDigite �mero 2 : ");
        numero2 = sc.nextInt();
        System.out.println("\nDigite o n�mero 3: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("\nNumero 1 � o maior de todos!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("\nN�mero 2 � o maior n�mero");
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("\nNumero 3 � o maior numero");
        } else {
            System.out.print("\nNenhum � maior ");
        }
        sc.close();


    }
}
