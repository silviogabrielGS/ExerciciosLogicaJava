package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        System.out.println("Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. " +
                "Calcular e escrever o valor do novo salário");

        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o seu salário anual?");
        float salario = leia.nextFloat();
        System.out.println("Qual o seu percentual de reajuste");
        float reajustebruto = leia.nextFloat();

        float reajuste = salario * (reajustebruto/100);
        float novosalario = salario + reajuste;
        System.out.println("O seu reajuste é de " + reajuste + " Seu novo salário é: " + novosalario);

        leia.close();
    }
}
