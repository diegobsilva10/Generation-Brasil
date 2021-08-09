package exercicios;

public class TesteEmpregado2 {
    public static void main (String[] args){
        Empregado1 diego = new Empregado1("Diego","Rua moro ali","1234567891011",
                40028922, 24, 29, 5000,12);
        diego.imprimirInfo();
        diego.calcularSalario();
    }
}