package exercicios;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome,String endereco, String cpf,
                     int telefone, int idade, double valorCredito, double valorDivida)
    {
        super(nome, endereco,cpf, telefone,idade);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void imprimirInfo() {
        System.out.println("Nome do fornecedor: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: "
                + getIdade() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco()
                + "\nValor monetário total dos artigos produzidos por " + getNome()
                + " Valor credito" + valorCredito + "\nValor divida:"+ valorDivida);

    }

    public void validarCpf()
    {
        if (getCpf().length()!=11)//contagem de caracter
        {
            System.out.println("\nCPF INVÁLIDO!!");
        }
        else
        {
            System.out.println("CPF VÁLIDO!");
        }
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
