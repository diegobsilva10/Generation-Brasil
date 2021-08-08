package exercicios;

public class TesteAutomovel {
    public static void main(String[] args) {
        // instanciando um objeto da classe automovel//

        Automovel terrivel = new Automovel("Diego Silva", "Porsche", "DBS - 2612", 2021);

        // troca de mensagens
        terrivel.imprimirInfo();
        System.out.println("\n\n*** transfer�ncia de propriet�rio***\n\n");

        terrivel.setNomeProprietario("Di");
        terrivel.imprimirInfo();

        // novo objeto da classe automovel
        Automovel valente = new Automovel("Silva", "Audi", "DBS2612", 2021);

        valente.imprimirInfo();
        valente.setPlaca("BDS2G16");
        valente.imprimirInfo();

    }
}
