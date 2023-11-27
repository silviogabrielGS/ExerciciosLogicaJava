package exemplo;

public class Array {
    public static void main(String[] args) {
        String[] carro = {"BMW" , "Mercedes" ,"Volvo"};
        
        for (int i = 0; i < carro.length; i++) {
            System.out.println(carro[i]);
        }

        for (String i: carro) {
            System.out.println(i);
        }
    }
}
