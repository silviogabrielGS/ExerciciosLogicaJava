package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        System.out.println("Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos " +
                "brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total " +
                "de eleitores");

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o numero total de votos em brancos: ");
        int votosbrancos = leia.nextInt();
        System.out.println("Escreva o numero total de votos em nulos: ");
        int votosnulos = leia.nextInt();
        System.out.println("Escreva o numero total de votos em válidos: ");
        int votosvalidos = leia.nextInt();

        float totalvotos = votosbrancos + votosnulos + votosvalidos;
        float porcvalidos = (votosvalidos *  100)/totalvotos;
        float porcnulos= (votosnulos *  100)/totalvotos;
        float porcbrancos= (votosbrancos *  100)/totalvotos;

        leia.close();

        System.out.println("O total de votos foram " + totalvotos);
        System.out.println("A porcentagem de votos válidos foi: " + porcvalidos);
        System.out.println("A porcentagem de votos nulos foi: " + porcnulos);
        System.out.println("A porcentagem de votos brancos foi: " + porcbrancos);
    }
}
