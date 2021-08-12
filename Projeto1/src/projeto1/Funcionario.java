package projeto1;

public class Funcionario {
	private String[] nome = {"Jo�o", "Paulo", "Pedro", "Jose"};
	private String[] cpf  = {"434.1z25.734/19","544.125.114/01","777.121.747/05","889.723.234/33"};
	private int id;
	private int compras;
	
  // CONSTRUTOR zzzz

	public Funcionario(String[] nome, String[] cpf, int compras) {

		this.compras = compras; // Quantidades de vendas realizadas pelo funcionario
	}
	
  // GETTERS AND SETTERS
	public String getNome(int id) {
		return nome[id];
	}

	public void setNome(String[] nome) {
		this.nome[id] = nome[id];
	}

	public String getCpf(int id) {
		return cpf[id];
	}

	public void setCpf(String[] cpf) {

		this.cpf[id] = cpf[id];
	}
	
	public int getCompras() {
		
		return compras;
	}

	public void setCompras(int compras) {
		
		this.compras = compras;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}
	
  // M�TODOS
	//Metodo para checar se o id inserido � valido ou n�o
	public boolean isIdValido(int id) {
		if (id < 0 || id >= cpf.length) {
			return false;		
		} else {
			return true;
		}

	}
	
	//modulo para a contagem da comiss�o [N�o finalizado, Douglas j� fez no arquivo ProjetoLoja.java, ent�o s� precisa pegar de l� e implementar aqui]
	public void comissao() {
		setCompras(getCompras()+1); 
	}

}
