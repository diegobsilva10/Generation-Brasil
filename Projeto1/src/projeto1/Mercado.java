package projeto1;

public class abstract Mercado{

    protected int valorDoProduto;
    protected String ListaProduto;


     abstract public void exibeValorProduto (int valorPoduto);
     abstract public void exibeListaProduto (String ListaProduo);


     public Mercado (valorDoProduto, ListaProduto )
        {
            this.valorDoProduto = valorDoProduto;
            this.ListaProduto = ListaProduto;
        }

        public String getValorDoProduto() {
            return valorDoProduto;

        }
        public String getListaProduto(){
            return valorDoProduto;
        }
        public String setListaProduto(String ListaProduto)
        {
            this.seListaProduto();
        }
}


