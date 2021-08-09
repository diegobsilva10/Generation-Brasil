package exercicios;

public class Automovel {
    // declara��o dos atributos

    private String nomeProprietario;
    private String modelo;
    private String placa;
    private int ano;

    public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
        // inicializando atributos da classa Automovel
        this.nomeProprietario = nomeProprietario;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;

    }

    // cria��o do metodo construtor
    public void imprimirInfo() {
        System.out.println("\n" + nomeProprietario + " possui um " + modelo + " com placa " + placa + "e ano" + ano);
    }

    // criando getters and setters

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
