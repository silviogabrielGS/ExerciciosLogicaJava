package exerciciosLista10;

public class Ex07 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                break;
            }

            switch (i) {
                case 1:
                    System.out.println("Seu numero é igual a 1'");
                    break;
                case 2:
                    System.out.println("Seu numero é igual a 2");
                    break;
                case 3:
                    System.out.println("seu numero é igual a 3");
                    break;
                case 4:
                    System.out.println("seu numero é igual a 4");
                    break;
                case 5:
                    System.out.println("seu numero é igual a 5");
                    break;
            }
        }
    }
}
