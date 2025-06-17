package heranca;

public class Vendedor extends Funcionario{

    private double comissaoVen;
    
    public Vendedor (double comissaoVen, String nomeFun, double salarioFun){
        super(nomeFun, salarioFun);
        this.comissaoVen = comissaoVen;
    }
    
    public String exibirDados(){
        return "Nome: " + super.nomeFun + ", Salario: " + super.salarioFun + ", Comissao: " + comissaoVen;
    }

}
