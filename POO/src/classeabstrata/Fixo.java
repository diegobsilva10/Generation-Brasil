package classeabstrata;

public class Fixo extends Telefone {

    public Fixo()
    {
        super("Telefone Fixo");
    }


    @Override
    public void toca(int numToques)
    {
        for (int i = 0;i<numToques;i++){
            System.out.print("o fixo ta tocando");
        }

    }
    @Override
    public void disca(String numero )
    {
        if(numero.charAt(0)=='9'|| numero.charAt(0)=='8'){
            System.out.println("num liga pra cel");
        }
        else
        {
            System.out.print("discando "+numero);
        }
    }
}
