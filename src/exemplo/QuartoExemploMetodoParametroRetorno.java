package exemplo;

public class QuartoExemploMetodoParametroRetorno {
    static int soma(int numero, int numero1){
        return numero + numero1;
    }

    public static void main(String[] args) {
        int resultado = soma(10,20);
        System.out.println(resultado);
    }
}
