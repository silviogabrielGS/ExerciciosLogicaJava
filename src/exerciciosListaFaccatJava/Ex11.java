package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex11 {
    public  static void main(String[] args){
        System.out.println("Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,\n" +
                "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele\n" +
                "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas\n" +
                "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do\n" +
                "vendedor");

        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos carros foram vendidos?: ");
        int carro = leia.nextInt();
        System.out.println("salário fixo: ");
        float salariofixo = leia.nextFloat();
        System.out.println("Qual a sua comissão?");
        float comissao = leia.nextFloat();

        leia.close();

        comissao = (salariofixo/100)*comissao;
        comissao = carro * comissao;
        float valortotal = comissao + salariofixo;

        System.out.println("O seu salário total é de: " + valortotal);
    }
}
