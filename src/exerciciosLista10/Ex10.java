package exerciciosLista10;

public class Ex10 {
    public static void main(String[] args) {
        int [] numeros = {2,4,6,8,-2,9,7};

        for (int i:numeros) {
            System.out.println(i);
            if (i < 0 ){
                break;
            }
        }
    }
}
