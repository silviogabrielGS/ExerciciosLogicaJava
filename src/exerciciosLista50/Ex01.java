package exerciciosLista50;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa para calcular a soma dos números de 1 a 100. ");
        int acumuladora = 0;
        for (int i = 0; i < 101 ; i++){
            System.out.println(i);
            acumuladora = i + acumuladora;
        }

        System.out.println(acumuladora);
    }
}
