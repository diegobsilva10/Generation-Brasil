package projeto1;

/*Classe responsavel por:
 * - Armazenar o estoque
 * - Armazenar o pre�o
 * - Exibir estoque
 * - Exibir pre�o
 * */ 
public class Produto {
	public Produto (String[] nomeProduto, double[] valorDoProduto) {
		
	}
	String[] nomeProduto = {"P�o Franc�s", "P�o de Leite", "Rosquinha Doce",
			"Rosquinha Salgada", "Broa de Milho", "Leite 1l",
			"Cafezinho", "Chocolate Quente"};
	double[] valorDoProduto = {0.45, 1.00, 1.50, 1.00, 1.25, 5.00, 1.00, 1.50};
	
  // GETTERS AND SETTERS
	public String getNomeProduto(int id) {
		return nomeProduto[id];
	}
	
	public void setNomeProduto(String[] nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getValorDoProduto(int id) {
		return valorDoProduto[id];
	}
	
	public void setValorDoProduto(double[] valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}
	
	
  // M�TODOS
	// Metodo para exibir os produtos no estoque
	public void exibirProdutos(){
		System.out.println("ID\t NOME DO PRODUTO \t VALOR");
		
		for (int i = 0; i < valorDoProduto.length; i++) {
			System.out.printf("[%d]\t%s\t\t%s\n",i,getNomeProduto(i),getValorDoProduto(i));
		}
	}
}