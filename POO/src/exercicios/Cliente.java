package exercicios;

import java.util.Scanner;

public class Cliente {
    //EXERCICIO POO DIA 06
    Scanner sc = new Scanner(System.in);
    double valorProduto, valorTotal;

    private String nomeCliente;
    private int codigoCliente;

    //construtor
    public Cliente(String nome, int codigo)
    {
        this.nomeCliente = nome;
        this.codigoCliente = codigo;
    }
    //métodos

    public Scanner getSc()
    {
        return sc;
    }
    public void setSc(Scanner sc)
    {
        this.sc=sc;
    }
    public double getValorProduto(){
        return valorProduto;
    }
    public void setValorProduto(double valorProduto)
    {
        this.valorProduto = valorProduto;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public double valor (double valorTotal){
        System.out.println("\n O valor de cada produto deve ser inserido individualmente. \nPara finalizar entre com zero");
        do
        {
            System.out.println("\nEntre com um valor");
            valorProduto = sc.nextDouble();
            valorTotal = valorTotal+valorProduto;

        }
        while(valorProduto>0.0);
        return  valorTotal;
    }
    public String getInfo()
    {
        String info = nomeCliente+"\t\t\t"+codigoCliente;
        return info;
    }
    public void compra()
    {
        System.out.printf("\nTotal: %.2f ", valor((0.0)));
    }
}

