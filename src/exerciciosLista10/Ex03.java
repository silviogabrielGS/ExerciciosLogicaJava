package exerciciosLista10;

public class Ex03 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 6; i2++) {
                if (i2 == 3){
                    break;
                }
                System.out.println(i2);
            }
            System.out.println(i);
        }
    }
}
