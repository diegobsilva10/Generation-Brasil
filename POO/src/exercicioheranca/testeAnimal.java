package exercicioheranca;

public class testeAnimal {
    public static void main (String [] args){
        Animal cavalinho = new Cavalo("cavalo", 7, "baru", "sim", "nao");
        Preguica pre = new Preguica ("pre",7,"barulho","s", "n");
        System.out.println(cavalinho.getNome());
        System.out.println(cavalinho.getIdade());

    }

}