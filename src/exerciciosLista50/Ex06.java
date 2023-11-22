package exerciciosLista50;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Implemente um algoritmo de ordenação de sua escolha para ordenar um array. ");
        int[] numeros = {1,3,6,2};

        Arrays.sort(numeros);

        System.out.println(Arrays.toString((numeros)));
    }
}
