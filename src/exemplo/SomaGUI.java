package exemplo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SomaGUI {
    JFrame f;
    SomaGUI(){
        f=new JFrame();
        int numero = Integer.parseInt(JOptionPane.showInputDialog(f,"Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(f,"digite outro numero"));
        int soma = numero +numero2;
        JOptionPane.showMessageDialog(f,"A soma dos valores digitados é: " + soma);
    }

    public static void main(String[] args) {
        new SomaGUI();
    }
}
