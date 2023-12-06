package exemplo;

public class ExemploRecursao {
    public static void main(String[] args) {
         int resultado = soma(5);
        System.out.println(resultado);


    }

    static int soma(int parametro){
        if (parametro >0 ){
            return parametro * soma(parametro -1 );
        } else {
            return 1;
        }
    }
}
