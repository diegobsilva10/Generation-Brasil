package exercicios;

public class Empregado1 extends Pessoa {
    private int codigoSetor;
    private float salarioBase;
    private float imposto;

    //Construtor

    public Empregado1 (String nome,String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
    {
        super(nome, endereco,cpf, telefone,idade);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public void imprimirInfo()
    {
        System.out.println("Nome do empregado: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "
                +getIdade()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()
                +"\nCódigo do Setor"+codigoSetor +"\nSalario Base: " + salarioBase);

    }
    public void calcularSalario()
    {
        double salario_total = salarioBase - (salarioBase * (imposto/100));
        System.out.println("\nO salário total a ser recebido pelo empregado"+ getNome()+"é igual a: "+salario_total);
    }
}
