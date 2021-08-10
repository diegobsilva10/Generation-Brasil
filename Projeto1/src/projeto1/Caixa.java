package projeto1;

import com.sun.xml.internal.ws.db.glassfish.MarshallerBridge;

public class Caixa{

    private int PrecoProduto;
    private String ListaProduto;
    private boolean abrirCaixa;

    //CONSTRUTOR

    public Caixa(int precoproduto,String listaproduto, boolean abrircaixa)

    //INSTANCIANDO AS VARIAVEIS DA CLASSE
    {
        super();
        this.PrecoProduto =  precoproduto;
        this.ListaProduto = listaproduto;
        this.abrirCaixa = abrircaixa;
    }

    // MÉTODOS

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
