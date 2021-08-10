package exerciciointerface;

public class Quadrado extends BaseFigura implements Figuras{
    //Extend(herança) a classe Base Figura implementa a interface Figura
    //exemplo de herança multipla

    public Quadrado(double lado, String nome)
    {
        super(lado,lado,nome);
        nomeClasse = "Quadrado";

    }
    @Override
    public double getDiagonal()
    {
        return Math.sqrt(2)*lado1;
    }

}
