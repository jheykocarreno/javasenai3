package desafio_sistemabanco;

public abstract class Conta {
    
    private int numero;
    private double saldo;
    
    public Conta(){
        
    }
    
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double novoSaldo){
        if (novoSaldo >= 0) {
            this.saldo = novoSaldo;
        } else {
            System.out.println("Erro: Saldo não pode ser negativo.");
        }
    }
    
    public double depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro: Valor de depósito deve ser positivo.");
        }
        return saldo;
    }
    
    public abstract double sacar(double valor);
    
    public abstract double calcRendimento();
            
    
}
