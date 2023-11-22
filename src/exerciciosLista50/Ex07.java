package exerciciosLista50;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("Desenvolva um programa que calcule o fatorial de um número. ");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = leia.nextInt();
        int resultado = 1;

        for (int i = 1; i <= numero ; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + resultado);

    }

}
