package Exe6;

public class Exer6{
    public static void main(String[] args) {
        int x = 51;
        while(x > 0){
        try{
        if(x > 50){
            throw new ExceptionA();
        }
        if(x > 30){
            throw new ExceptionB();
        }
        if(x > 20){
            throw new ExceptionC();
        }
        System.out.println("O Numero digitado é menor ou igual a 20.");
        }catch (ExceptionA erro){
            System.out.println(erro.toString());
        }
        x -= 10;
    }

    }
}
