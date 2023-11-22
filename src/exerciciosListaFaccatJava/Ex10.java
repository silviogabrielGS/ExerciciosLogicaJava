package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        System.out.println("O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do\n" +
                "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor\n" +
                "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,\n" +
                "calcular e escrever o custo final ao consumidor.");

        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o custo de fábrica do seu carro?");
        float custodefabrica = leia.nextFloat();
        double imposto = custodefabrica * 0.45;
        double distribuidor = custodefabrica * 0.28;
        double custofinal = custodefabrica + imposto + distribuidor;

        System.out.println("O valor final do seu carro é:" + custofinal);

        leia.close();
    }
}
