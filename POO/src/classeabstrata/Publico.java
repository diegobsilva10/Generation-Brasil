package classeabstrata;

public class Publico extends Telefone {
    public Publico ()
    {
        super("Telefone publico");
    }
    @Override
    public void toca (int numToques)
    {
        for (int i=0; i<numToques; i++)
        {
            System.out.print("publiico ligando");
        }


    }
    @Override
    public void disca(String numero)
    {
        if(numero.charAt(0)=='9'|| numero.charAt(0)=='8')
        {
            System.out.print("num liga pra celular");
        }
    }
}
