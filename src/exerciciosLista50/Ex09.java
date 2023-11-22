package exerciciosLista50;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que calcule a média de um array de números. ");
        Scanner leia = new Scanner(System.in);
        int[] numero = new int[5];
        float resultado = 0;

        // inserindo os dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira sua nota " + (i + 1));
            numero[i] = leia.nextInt();
        }

        // fazendo a média
        for (int i = 0; i < 5; i++) {
            resultado = resultado + numero[i]  ;
            System.out.println(resultado);
        }
        resultado = resultado/5;
        System.out.println("A sua média é: " + resultado);
    }
}
