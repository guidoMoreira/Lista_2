package Exe6;

public class ExceptionC extends ExceptionB{
    public ExceptionC(){
        super("Exceção C, Número maior que 20 e menor que 31");
    }
    public ExceptionC(String s){
        super(s);
    }
}
