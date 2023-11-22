package exerciciosLista50;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa para verificar se uma string é um palíndromo. ");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira uma frase , para verificar se ela é um palindromo:");
        String frase = leia.nextLine();

        StringBuilder fraseaocontrario = new StringBuilder(frase);
        fraseaocontrario.reverse();

        String resultado = fraseaocontrario.toString();
        System.out.println("String original: " + frase);
        System.out.println("String Invertida: " + fraseaocontrario);

        if (frase.equalsIgnoreCase(resultado)){
            System.out.println("Sua palavra é um palindromo");
        } else {
            System.out.println("Sua frase não é uma palindromo");
        }
    }
}
