package exerciciosLista50;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que encontre o menor elemento em um array. ");
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[5];
        int menor = 0;

        // inserindo os dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um numero ");
            numero[i] = leia.nextInt();
        }

         // verificando o menor
        for (int i = 0; i < 5; i++) {
            if (numero[i] < numero.length){
                menor = numero[i];
            }
        }
        System.out.println("O menor numero inserido foi: " + menor);
    }
}
