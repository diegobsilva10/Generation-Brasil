package exercicios;

public class ExercicioFor {

    public static void main(String[] args) {
        //Ler 10 n�meros e imprimir quantos s�o
        //pares e quantos s�o �mpares.
        int contpar = 0, contimpar = 0;

        for (int contador = 1; contador <= 10; contador++) {
            if (contador % 2 == 0) {

                contpar++;


            } else {
                contimpar++;
            }

            System.out.println(contador);
        }
        System.out.println(contpar);
        System.out.println(contimpar);
    }
}
