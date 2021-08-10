package exercicios;

import java.text.NumberFormat;

public class Empregado {

    // Declaraçao dos atributos

    private String nome;
    private double salario;

    // cria��o do metodo construtor

    public Empregado(String nome, double salario) {
        // inicializandjo atributos da classe Empregado\\

        this.setNome(nome);
        this.setSalario(salario);

    }

    // cria�ao dos metos da classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario *= 1 + percentual / 100;
    }

    public String formatarMoeda() {

        NumberFormat nf = NumberFormat.getCurrencyInstance(); // define a moeda padrao por pa�s
        nf.setMinimumFractionDigits(2); // quantos numeros eu quero dps da virgula
        String formatoMoeda = nf.format(salario); // formata a sa�da
        return formatoMoeda;

    }

    public void imprimir() {
        System.out.println(nome + "\t" + "Sal�: " + this.formatarMoeda());
    }

}
