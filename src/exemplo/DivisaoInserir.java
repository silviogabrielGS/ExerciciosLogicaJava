package exemplo;

import java.util.Scanner;

public class DivisaoInserir {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero:" );
        float numero=sc.nextFloat();
        System.out.println("Digite um numero:");
        float numero2 = sc.nextFloat();

        float divisao = numero / numero2;

        System.out.println("A divisao é igual a: " + divisao);

        sc.close();
    }
}
