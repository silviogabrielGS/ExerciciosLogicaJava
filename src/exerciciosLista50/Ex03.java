package exerciciosLista50;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Implemente um programa que verifique se um número é primo. ");
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira um número");
        float numero = leia.nextFloat();
        leia.close();
        if ((numero == 2 || numero == 3 || numero == 5) || (numero%2 != 0 && numero%3 != 0 && numero%3 != 0 )){
            System.out.println("Seu número é primo");
        } else {
            System.out.println("Seu número não é primo");
        }
        }
}
