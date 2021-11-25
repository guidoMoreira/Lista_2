package Exe6;

public class ExceptionA{
    static void WriteSomeThing (String x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x.isEmpty()) {
            throw new ExceptionC(); // aqui é importante que vc instâncie alguma das classes de exceção...
            }
    } catch (ExceptionA e) {
        System.out.println(e.toString());
    }
    public static void lancaExcecao() throws Exception{
        try{
            System.out.println( "Exceção A." );
            ExcecaoB.lancaExcecaoB();
        }
        catch( Exception exception ){
            System.err.println( "Captura ExcecacoB e ExcecaoC" );
        }

    }
}
