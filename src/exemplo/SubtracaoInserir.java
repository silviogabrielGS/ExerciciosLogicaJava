package exemplo;
import java.util.Scanner;

public class SubtracaoInserir {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero:" );
        int numero=sc.nextInt();
        System.out.println("Digite um numero:");
        int numero2 = sc.nextInt();

        int subtracao = numero - numero2;

        System.out.println("A subtracao é igual a: " + subtracao);

        sc.close();
    }

}
