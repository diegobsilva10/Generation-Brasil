package exerciciopolimorfismo;

public class TestePolimorfismo {
    public static void main (String[] args){
        Cavalo cavalinho = new Cavalo("DI");
        cavalinho.setBoca(" barulho do cavalo");
        Preguica preguicinha = new Preguica("Floresta");
        preguicinha.setBoca("barulho da preguiça");

        Animal[] animais = new Animal[2];
        animais [0]= cavalinho;
        animais [1] = preguicinha;

        for(Animal animal:animais)
        {
            System.out.println(animal.getBoca());
        }
    }
}

