package exerciciopolimorfismo;

public class Cavalo extends Animal {
    private String nomeDono;

    public Cavalo(String nomeDono) {
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getBoca(){
        return "Barulho do cavalo"+ super.getBoca();
    }
}
