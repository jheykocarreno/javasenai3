package desafio_contabanco;

public class Desafio_ContaBanco {

    public static void main(String[] args) {
        
        ContaCorrente corrente = new ContaCorrente(1, 2000, 0);
        System.out.println(corrente.getSaldo());
        
        corrente.setSaldo(1000);
        
        corrente.depositar(20);
        System.out.println(corrente.getSaldo());
        
        corrente.sacar(50);
        System.out.println(corrente.getSaldo());
        
        corrente.calcularRendimento();
        System.out.println(corrente.getSaldo());
        
        corrente.toString();
        
        ContaPoupanca poupanca = new ContaPoupanca();
        
        
    }
    
}
