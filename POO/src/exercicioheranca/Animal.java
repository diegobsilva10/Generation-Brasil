package exercicioheranca;

public class Animal {
    private String nome;
    private int idade;
    private String boca;
    private String andar;
    private  String parar;

    public Animal(String nome, int idade, String boca) {
        this.nome = nome;
        this.idade = idade;
        this.boca = boca;
        this.andar = andar;
        this.parar = parar;
    }

    public String getParar() {
        return parar;
    }

    public void setParar(String parar) {
        this.parar = parar;
    }

    public String getSom() {
        return boca;
    }

    public void setSom(String som) {
        this.boca = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String emitirSom(String som) {
        String novoSom = som;
        this.boca = novoSom;
        return this.boca;
    }

    public void deveCorrer(String movimento)
    {   if(this.andar.equals("sim"))
    {
        String emMovimento = movimento;
        this.andar = movimento;
    }
    }
    public void deveParar(String movimento2){
        if((this.parar.equals("sim")))
        {
            String deveParar = movimento2;
            this.parar = movimento2;
        }
    }
}
