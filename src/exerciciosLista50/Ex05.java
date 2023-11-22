package exerciciosLista50;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que encontre o maior elemento em um array. ");
        int[] numeros = {2,5,15,8,9};
        int maximo = numeros[0];
         for (int i = 1; i < numeros.length; i++){
             if (numeros[i] > maximo ){
                 maximo = numeros[i];
             }
         }
        System.out.println(maximo);
    }
}
