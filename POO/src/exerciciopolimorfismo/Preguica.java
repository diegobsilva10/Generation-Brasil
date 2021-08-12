package exerciciopolimorfismo;

public class Preguica extends Animal{
    private String localNascimento;

    public Preguica(String localNascimento) {

    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getBoca()
    {
        return "Barulho da preguiça" +super.getBoca();
    }
}
