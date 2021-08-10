package projeto1;

import com.sun.xml.internal.ws.db.glassfish.MarshallerBridge;

public class Caixa implements Mercado{

    private int PrecoProduto;
    private String ListaProduto;
    private boolean abrirCaixa;
    private String iniciaCompra;


    //CONSTRUTOR

    public Caixa(precoproduto,iniciaCompra,S tring listaproduto, abrircaixa)

    //INSTANCIANDO AS VARIAVEIS DA CLASSE
    {
        super();
        this.iniciaCompra = setIniciaCompra();
        this.PrecoProduto =  precoproduto;
        this.ListaProduto = listaproduto;
        this.abrirCaixa = abrircaixa;
    }

    // MÉTODOS
    @Override
    public void exibeValor (int valorProduto)
    {

    }
    public void exibeListaProduto (String ListaProduo)
    {

    }
    public String getIniciaCompra() {
        return iniciaCompra;
    }

    public void setIniciaCompra(String iniciaCompra) {
        this.iniciaCompra = iniciaCompra;
    }

    @
    public int getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(int precoProduto) {
        PrecoProduto = precoProduto;
    }

    public String getListaProduto() {
        return ListaProduto;
    }

    public void setListaProduto(String listaProduto) {
        ListaProduto = listaProduto;
    }

    public boolean isAbrirCaixa() {
        return abrirCaixa;
    }

    public void setAbrirCaixa(boolean abrirCaixa) {
        this.abrirCaixa = abrirCaixa;
    }

    public void caixaAberto (){
        if (this.abrirCaixa == true)
        {
            System.out.println("Caixa Aberto, podemos trabalhar!");
        }
        else
        {
            System.out.println("Caixa Fechada!");
        }
    }


    public void fecharCaixar()
    {
        System.out.println("Caixa Fechado");
    }
}
