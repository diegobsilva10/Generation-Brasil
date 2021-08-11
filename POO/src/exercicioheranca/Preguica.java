package exercicioheranca;

public class Preguica extends Animal {
    private String subir;
    private String descer;

    public Preguica(String nome, int idade, String boca, String subir, String descer) {
        super(nome, idade, boca);
        this.subir = subir;
        this.descer = descer;
    }

    public String getSubir() {
        return subir;
    }

    public void setSubir(String subir) {
        this.subir = subir;
    }

    public String getDescer() {
        return descer;
    }

    public void setDescer(String descer) {
        this.descer = descer;
    }

    public void movimentar (String movimento){
        if (this.subir.equals('s')){
            System.out.println("Subindo na avore");
        }
        else
        {
            System.out.println("descendo");
        }

    }
}
