package exerciciosLista50;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Implemente um jogo de adivinhação simples. ");
        Random random = new Random();
        int numero = random.nextInt() * (0 - 10);

        System.out.println("tente adivinhar o número de 1 a 10");
        Scanner leia = new Scanner(System.in);
        int numeroAdivinha = leia.nextInt();

        System.out.println(numero + numeroAdivinha);


    }
}
