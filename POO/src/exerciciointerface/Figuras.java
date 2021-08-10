package exerciciointerface;

public interface Figuras {

    public String nomeINterface = "figuras;";
    abstract public String getNome();
    abstract public void setNome(String nome);

    public double getArea();
    public double getPerimetro();
    public double getDiagonal();

}
