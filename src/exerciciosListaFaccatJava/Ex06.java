package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a base do seu retangulo: ");
        float base = leia.nextFloat();
        System.out.println("Escreva a altura do retangulo");
        float altura = leia.nextFloat();

        float area = base * altura;

        System.out.println("A base do seu retangulo é: " + area );
        leia.close();
    }
}
