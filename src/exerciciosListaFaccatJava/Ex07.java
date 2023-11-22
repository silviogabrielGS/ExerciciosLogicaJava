package exerciciosListaFaccatJava;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva sua idade em anos: ");
        int anos = leia.nextInt();
        System.out.println("Escreva seus meses: ");
        int meses = leia.nextInt();
        System.out.println("Insira sua idade em dias: ");
        int dias = leia.nextInt();
        int diastotais ;

        leia.close();

        diastotais = anos * 365 + meses * 30 + dias;

        System.out.println("O numero de dias que você tem de idade é:" + diastotais);
    }
}
