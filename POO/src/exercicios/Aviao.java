package exercicios;

public class Aviao {
    private int id;
    private String destino;
    private boolean decolando;
    private String info;
    //CONSTRUTOR

    public Aviao (int id, String destino, boolean decolando)
    {
        this.id = id;
        this.destino = destino;
        this.decolando = decolando;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void decolar ()
    {
        if (this.decolando = true){
            System.out.println("Decolando");
        }
        else{
            System.out.println("PODE DECOLAR");
        }

    }
    public void aterrissar (){
        if (decolando == true){
            System.out.println("Pode aterrisar");
        }
        else
        {
            System.out.println("já ta na terra");
        }
    }

    public String getInfo()
    {
        String info = getId()+"\t\t\t"+getDestino()+"\t\t\t"+ decolando;
        return info;
    }

}
