package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex12 {
    public  static void main(String[] args){
        System.out.println("Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor\n" +
                "correspondente em graus Celsius (baseado na fórmula abaixo):");

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva a temperatura em Fahrenheit");
        float fahrenheit = leia.nextFloat();
        float celcius = (float) ((fahrenheit -32)/1.8);
        leia.close();

        System.out.println("Em celcius fica: " + celcius);
    }
}
