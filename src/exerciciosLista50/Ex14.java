package exerciciosLista50;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que conte o número de vogais em uma string. ");

        Scanner leia = new Scanner(System.in);
        System.out.println("Insira sua frase");
        String frase = leia.nextLine();

        leia.close();

        int numeroVogais = contarVogais(frase);
        System.out.println("O numero de vogais que tem a sua frase é:" + numeroVogais);

    }

    public static int contarVogais(String string){
        int contador = 0;
        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char letra = string.charAt(i);

            if(letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }

        return contador;
    }
}
