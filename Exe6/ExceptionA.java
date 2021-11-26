package Exe6;

public class ExceptionA extends Exception{
    public ExceptionA(){
        super("Exceção A, Número maior que 50");
    }
    public ExceptionA(String s){
        super(s);
    }
}