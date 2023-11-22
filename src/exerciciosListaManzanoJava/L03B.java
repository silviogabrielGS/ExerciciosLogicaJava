package exerciciosListaManzanoJava;

public class L03B {
    public static void main(String[] args) {
        System.out.println("Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).");
        int acumuladora = 0;

        for(int i = 0; i < 101; i++){
            acumuladora = i + acumuladora;
        }
        System.out.println(acumuladora);
    }
}
