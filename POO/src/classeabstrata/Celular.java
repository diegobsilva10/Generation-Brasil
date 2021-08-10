package classeabstrata;

public class Celular extends Telefone{
    public Celular()
    {
        super("Telemfone celular");
    }
    @Override
    public void toca(int codigoToque)
    {

        switch (codigoToque)
        {
            case 1:
                System.out.print("ATENDEEEEEEEEEEE");
                break ;
            case 2:
                System.out.print("TÃO TE LIGANDO");
                break;
                default:
                    System.out.print("VAI ATENDER NAO?");

        }
    }
    public void disca(String numero)
    {
        System.out.println("\nO número "+numero+" "+"É um celular...");
    }

}
