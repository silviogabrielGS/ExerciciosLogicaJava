package exemplo;

public class TerceirooExemploMetodoParametro {
    static void dadosCompletos(String nome, String sobrenome , int idade , String bairro){
        System.out.println("Meu nome é " + nome + " " + sobrenome  + " minha idade é" + idade +  "moro no bairro " + bairro);
    }

    public static void main(String[] args) {
        dadosCompletos("silvio ", "Santana",18,"Jardim Presidente Dutra");
    }
}
