package exercicios;

public class Operario extends Pessoa {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String cpf,
                    int telefone, int idade, double valorProducao, double comissao) {
        super(nome, endereco, cpf, telefone, idade);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public void imprimirInfo() {
        System.out.println("Nome do operario: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: "
                + getIdade() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco()
                + "\nValor monetário total dos artigos produzidos por " + getNome()
                + " : " + valorProducao + "\nPorcentagem (sem o %) da comissão deste artigo" + comissao);

    }

    public void calcularValorArtigo() {
        double valor_total = valorProducao + (valorProducao * (comissao / 100));
        System.out.println("\nO valor total a ser recebido pelo operario: " + getNome() + " é igual a: " + valor_total);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
