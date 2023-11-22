package exerciciosListaManzanoJava;

import java.util.Scanner;

public class L03A {
    public static void main(String[] args) {
        System.out.println("Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.");
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira um numero para ver a tabuada dele");
        int numero = leia.nextInt();
        leia.close();
        int resultado = 0 ;

        for(int i = 0; i < 11 ; i++ ){
            resultado = i * numero;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}
