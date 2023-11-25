package exerciciosLista50;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que gere os primeiros n números da sequência de Fibonacci. ");
        int numero = 1;
        int resultado = 1;
        int antecessor = 1;

        System.out.println(numero);
        System.out.println(antecessor);
        for (int i = 0; i < 14; i++) {

            antecessor = numero;
            numero = resultado;
            resultado = numero + antecessor;

            System.out.println(resultado);
        }

    }
}
