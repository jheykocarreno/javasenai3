package desafio_contabanco;

public class ContaPoupanca extends Conta{
    
    double valor;
    
    public ContaPoupanca() {
        
    };
    
    public ContaPoupanca(int numeroConta, double saldoConta, double valor){
        super(numeroConta, saldoConta);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void sacar(double valor) {
        
        if (valor <= getSaldo()){
            super.setSaldo(getSaldo() - valor); 
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println(getSaldo());
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.05;
    }
    
    
    
}
