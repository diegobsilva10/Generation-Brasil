package exercicios;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Exercicio dia 08 de Agosto


        float[][] mat1 = new float[2][2];
        float[][] mat2 = new float[2][2];
        float[][] mat3 = new float[2][2];
        int constante, l, c, op;

        Scanner leia = new Scanner(System.in);

        for (l = 0; l < 2; l++) {
            for (c = 0; c < 2; c++) {
                System.out.println("\nEntre com o valor da Matriz1: ");
                mat1[l][c] = leia.nextFloat();
                System.out.println("\nEntre com o valor da Matriz2: ");
                mat2[l][c] = leia.nextFloat();
            }
        }


        do {
            System.out.println("\n\t\t\tMenu de op��es");
            System.out.println("\n(1) Somar as duas matrizes.");
            System.out.println("\n(2) Subtrair a primeira matriz da segunda.");
            System.out.println("\n(3) Adicionar uma constante as duas matrizes.");
            System.out.println("\n(4) Imprimir as matrizes.");
            System.out.println("\n(0) Sair do programa.");

            System.out.println("\nDigite sua op��o: ");
            op = leia.nextInt();

            switch (op) {
                case 1:
                    for (l = 0; l < 2; l++) {
                        for (c = 0; c < 2; c++) {
                            mat3[l][c] = mat1[l][c] + mat2[l][c];
                            System.out.println("\nSoma: " + mat3[l][c]);
                        }
                    }
                    break;
                case 2:
                    for (l = 0; l < 2; l++) {
                        for (c = 0; c < 2; c++) {
                            mat3[l][c] = mat2[l][c] - mat1[l][c];
                            System.out.println("\nDiferen�a: " + mat3[l][c]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nEntre com o valor da constante: ");
                    constante = leia.nextInt();
                    for (l = 0; l < 2; l++) {
                        for (c = 0; c < 2; c++) {
                            mat1[l][c] = mat1[l][c] + constante;
                            mat2[l][c] = mat2[l][c] + constante;
                            System.out.println("\nMatriz1: " + mat1[l][c]);
                            System.out.println("\nMatriz2: " + mat2[l][c]);
                        }
                    }
                    break;
                case 4:
                    for (l = 0; l < 2; l++) {
                        for (c = 0; c < 2; c++) {

                            System.out.println("\nMatriz1: " + mat1[l][c]);
                            System.out.println("\nMatriz2: " + mat2[l][c]);
                        }
                    }
                    break;
                default:
                    System.out.println("\n Op��o inv�lida!!!");
                    for (int x = 1; x <= 15; x++) {
                        System.out.println("\n");
                    }

            }
        }
        while (op != 0);
    }

}
