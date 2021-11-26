package Exe6;

public class ExceptionB extends ExceptionA{
    public ExceptionB(){
        super("Exceção B, Número maior que 30 e menor que 51");
    }
    public ExceptionB(String s){
        super(s);
    }
}
