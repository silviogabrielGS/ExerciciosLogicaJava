package exemplo;

import java.util.Scanner;

public class MultiplicacaoInserir {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero:" );
        int numero=sc.nextInt();
        System.out.println("Digite um numero:");
        int numero2 = sc.nextInt();

        int multiplicacao = numero * numero2;

        System.out.println("A multiplicacao é igual a: " + multiplicacao);

        sc.close();
    }
}
