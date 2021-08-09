package exercicios;

public class TesteCliente {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente("diego", 123);
        cliente1.compra();
        System.out.println(cliente1.getInfo());

    }
}
