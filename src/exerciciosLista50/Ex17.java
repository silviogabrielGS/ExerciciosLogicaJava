package exerciciosLista50;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        System.out.println("Implemente um programa que calcule o MMC (mínimo múltiplo comum) de dois números. ");
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira seu primeiro número");
        int numero1 = leia.nextInt();

        System.out.println("Insira seu primeiro número");
        int numero2 = leia.nextInt();

        leia.close();

        int resultado1 = calcMMC(numero1);
        int resultado2 = calcMMC(numero2);

        System.out.println("o MMC do seu primero número é ");

    }

    public static int calcMMC(int nmr){
        int resultado;
        int MMC = 1;
        for (int i = 0; i < nmr ; i++) {
           resultado = i % nmr ;

            if (resultado == 0){
                MMC = i;
            }
        }
        return MMC;
    }
}
