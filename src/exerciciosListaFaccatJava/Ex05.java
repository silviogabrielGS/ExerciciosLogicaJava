package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("insira um numero para saber o seu antecessor: ");
        int numero = leia.nextInt();
        int antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor );
        leia.close();
    }
}
