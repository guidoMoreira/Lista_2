package Exe3;
import java.util.ArrayList;

public class Exer3 {
    public static void main(String[] args) {
        ArrayList <IConversorMoeda> Converter = new ArrayList<>();
        Converter.add(new Bitcoin(1));
        Converter.add(new Real(1));
        Converter.add(new Euro(1));

        for (IConversorMoeda valores : Converter){
            System.out.print("Comversão de "+valores.getTipo()+" em dolares: USD "+ valores.getConversaoDolar()+"\n");
        }
    }
}