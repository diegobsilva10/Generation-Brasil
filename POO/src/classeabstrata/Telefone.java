package classeabstrata;

public abstract class Telefone {
    //ATRIBUTOS
    //
    private String tipo;
    //metodo abstrato
    abstract public void disca (String numero);
    abstract public void toca (int numToques);

    //Construtor
    public Telefone(String tipo)
    {
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
