package desafio_sistemabanco;

public class ContaCorrente extends Conta{
    
    double valor;
    
    public ContaCorrente(){}
    
    public ContaCorrente(int numConta, double salConta, double valor){
        super(numConta, salConta);
        this.valor = valor;
    }

    @Override
    public double sacar(double valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double calcRendimento() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
