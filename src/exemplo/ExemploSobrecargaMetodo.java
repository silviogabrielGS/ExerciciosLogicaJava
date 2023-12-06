package exemplo;

public class ExemploSobrecargaMetodo {
    public static int somaMetodo(int numero ,int numero1){
        return numero + numero1;
    }

    public static double somaMetodo(double numero ,double numero1){
        return numero + numero1;
    }

    public static void main(String[] args) {
        int resultadosomaInt = somaMetodo(12,24);
        double resultadosomaDouble = somaMetodo(12.5 , 14.5);

        System.out.println(" Oresultado da soma dos inteiros é:" + resultadosomaInt);
        System.out.println(" Oresultado da soma dos reis é:" + resultadosomaDouble);
    }
}
