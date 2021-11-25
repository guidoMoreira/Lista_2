package Exe2;

public abstract class MembroUniversidade {
    protected float Pagamento;
    public Float getPagamento(){
        return this.Pagamento;
    }

    abstract String getTipo();
    abstract String eFuncionario();
    abstract String eAluno();
    abstract String eTercerizado();
    abstract String RecebeSalarioMin();

}
