package exerciciosLista50;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que inverta uma string. ");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira uma frase:");
        String frase = leia.nextLine();

        StringBuilder fraseaocontrario = new StringBuilder(frase);
        fraseaocontrario.reverse();

        String resultado = fraseaocontrario.toString();
        System.out.println("String original: " + frase);
        System.out.println("String Invertida: " + fraseaocontrario);
    }
}
