package exercicios;

public class TesteAviao {
    public static void main (String[] args){
        Aviao aviao1 = new Aviao(123, "frança",true);
        aviao1.decolar();
        System.out.println(aviao1.getInfo());

    }
}
