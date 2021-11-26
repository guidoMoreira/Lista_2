package Exe10;


import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exer10 {
    private JTextField campoTexto;

    //Singleton-----
    static private Exer10 instancia = null;
    private Exer10(){

        JFrame j = new JFrame();

        JTextField campoTexto = new JTextField(10);
        campoTexto.setBounds(50,100,200,30);
        j.add(campoTexto);
        j.setSize(400,400);
        j.setLayout(null);
        j.setVisible(true);
    }
    static Exer10 getInstancia(){
        if(instancia == null){
            new Exer10();}
        return instancia;
    }
    //--------------

    public static void main(String[] args) {
        Exer10 Singleton = Exer10.getInstancia();

    }
}
