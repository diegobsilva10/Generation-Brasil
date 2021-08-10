package exerciciointerface;

public class TestaFigura {
    public static void main (String [] args){

        Quadrado fig1 = new Quadrado (10, "Quadrado");
        Retangulo fig2 = new Retangulo(3,4,"Retangulo1");

        System.out.print(fig1.getNome()+" "+fig1+" "+ fig1.getDiagonal());
        System.out.print(fig1.getNome()+" "+fig2+" "+ fig2.getDiagonal());
    }
}
