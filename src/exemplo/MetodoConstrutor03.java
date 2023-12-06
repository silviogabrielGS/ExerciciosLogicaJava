package exemplo;

public class MetodoConstrutor03 {


        int anoModelo;
        String nomeModelo;
        public MetodoConstrutor03(int ano, String nome) {
            anoModelo = ano;
            nomeModelo = nome;
        }
        public static void main(String[] args) {
            MetodoConstrutor03 carro01 = new MetodoConstrutor03(1969, "Mustang");
            System.out.println(carro01.anoModelo + " " + carro01.nomeModelo);
        }

}

