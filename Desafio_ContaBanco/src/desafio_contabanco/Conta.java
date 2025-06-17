package desafio_contabanco;

public abstract class Conta {
    
    protected int numero;
    protected double saldo;
    
    public Conta(){
        
    }
    
    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            System.out.println("Nao permite valor negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public abstract void sacar(double valor);
    
    public abstract double calcularRendimento();
    
}
