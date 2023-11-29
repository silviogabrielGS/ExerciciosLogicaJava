package exemplo;

public class SegundoExemploDeMetodoParametro {
    static void mensagem(String nome){
        System.out.println(nome + " " + "Lemes");
    }

    public static void main(String[] args) {

        String nome ;

        mensagem("Alexandre Lemes");
        mensagem("Danilo");
        mensagem("Felipe");
    }
}
