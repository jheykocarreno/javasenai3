package heranca;

public class Main {

    public static void main(String[] args) {
        
        Funcionario vendedor = new Vendedor(205.00, "Gui", 100.000);
        System.out.println(vendedor.exibirDados());
        System.out.println(vendedor.bonusFuncionario());
        
        Funcionario gerente = new Gerente("TI", "Rodri", 23.076);
        System.out.println(gerente.exibirDados());
    }
    
}
