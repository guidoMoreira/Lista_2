package Exe8;
import javax.swing.JOptionPane;
public class Exer8 {
    public static void main(String[] args) {
        String nome = null;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
    }
}
