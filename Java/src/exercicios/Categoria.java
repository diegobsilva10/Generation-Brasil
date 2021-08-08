package exercicios;

import java.util.Scanner;

public class Categoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 10 && idade <=14)
        {
            System.out.println("Infantil");
        }
        else if(idade >= 15 && idade <= 17)
        {
            System.out.println("Juenil");
        }
        else if(idade > 18 && idade <= 25 || idade > 25);
        {
            System.out.println("Adulto");
        }
        sc.close();
    }

}
