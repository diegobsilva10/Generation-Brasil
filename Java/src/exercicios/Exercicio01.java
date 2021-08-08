package exercicios;

public class Exercicio01 {

    public static void main(String[] args) {
        // Informar todos os n�meros de 1000 a 1999 que quando
        //divididos por 11
        //obtemos resto = 5.

        for (int contador = 1000; contador <= 1999; contador++) {
            if (contador % 11 == 5) {
                System.out.println(contador);
            }

        }
    }

}
