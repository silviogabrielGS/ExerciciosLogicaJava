package exerciciosListaManzanoJava;

public class L03C {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de\n" +
                "1 até 500.");
        int acumuladora = 0;

        for (int i = 0; i < 501; i = i + 2) {
            acumuladora = i + acumuladora;
        }
        System.out.println(acumuladora);
    }
}
