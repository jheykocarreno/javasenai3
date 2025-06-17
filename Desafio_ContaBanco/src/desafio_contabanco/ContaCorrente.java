package desafio_contabanco;

public class ContaCorrente extends Conta {

    double valor; 
    
    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, double saldoConta, double valor){
        super(numeroConta, saldoConta);
        this.valor = valor;
    }

    public ContaCorrente(double valor) {
        this.valor = valor;
    }
    
    @Override
    public void sacar(double valor) {
        
        if ((valor + 2) <= getSaldo()){
            super.setSaldo(getSaldo() - valor - 2); 
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double calcularRendimento() {
        System.out.println("Nao rende nada");
        return getSaldo();
    }

    @Override
    public String toString() {
        return "ContaCorrente: Numero: " + super.numero + " Saldo: " + super.saldo;
    }

}
