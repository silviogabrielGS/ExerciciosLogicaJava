package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex13 {
    static void main(String[] args){
        System.out.println("Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.\n" +
                "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média\n" +
                "final é:");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira sua primeira nota");
        float nota1 = leia.nextFloat();
        System.out.println("Insira sua segunda nota");
        float nota2 = leia.nextFloat();
        System.out.println("Insira sua terceira nota");
        float nota3 = leia.nextFloat();

        double mediafinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;

        System.out.println("A media da sua nota final é: " + mediafinal );
        leia.close();

    }
}
