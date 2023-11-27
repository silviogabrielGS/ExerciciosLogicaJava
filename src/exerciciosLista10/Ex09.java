package exerciciosLista10;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {


        for (int i = 1; i < 1000 ; i++) {
            System.out.println("Insira um numero");
            Scanner leia = new Scanner(System.in);
            int numero = leia.nextInt();

            if (numero == 0){
                break;
            }
        }
    }
}
