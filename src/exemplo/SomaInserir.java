package exemplo;

import java.util.Scanner;

public class SomaInserir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero:" );
        int numero=sc.nextInt();
        System.out.println("Digite um numero:");
        int numero2 = sc.nextInt();

        int soma = numero + numero2;

        System.out.println("A soma é igual a: " + soma);

        sc.close();
    }
}
