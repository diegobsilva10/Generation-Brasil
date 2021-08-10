package classeabstrata;

public class TesteTelefone {

    public static void main(String[] args) {
        Celular celular = new Celular();
        Fixo fixo = new Fixo();
        Publico publico = new Publico();
        Telefone telefone = new Telefone() {
        }


        int n = (int) (Math.random() * 3.0);
        System.out.print("\nNumero escolhido: " + n);
    }
        switch(n)

    {
        case 0:
            telefone = celular;
            breack;
        case 1:
            telefone = fixo;
            breack;
        case 2:
            telefone = publico;
            break;
        default:
            System.out.print("\nErro inesperado");
    }
        if(telefone 1=null)

    {
        telefone.disca("987456123");
        telefone.toca(1);
    }

}
