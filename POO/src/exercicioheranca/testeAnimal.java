package exercicioheranca;

public class testeAnimal {
    public static void main (String [] args){
        // objetos
        Animal cavalinho = new Cavalo("cavaloo", 7, "baru", "sim", "nao");
        Preguica preguicinha = new Preguica ("pre",7,"barulho","s", "n");
        System.out.println(cavalinho.getSom());
        System.out.println(preguicinha.getSom());

    }

}
