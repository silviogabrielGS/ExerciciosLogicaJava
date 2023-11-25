package exerciciosLista50;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("Desenvolva um programa que calcule a raiz quadrada de um número.  ");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira seu numero");
        double numero = leia.nextDouble();
        leia.close();

        double raizQ = Math.sqrt(numero);
        System.out.println("A raiz quadrada do seu número é: " + raizQ);
    }
}

