package heranca;

public class Gerente extends Funcionario{
    
    private String setorGer;

    public Gerente(String setorGer, String nomeFun, double salarioFun) {
        super(nomeFun, salarioFun);
        this.setorGer = setorGer;
    }

    public String exibirDados(){
        return "Nome: " + super.nomeFun + ", Salario: " + super.salarioFun + ", Setor: " + setorGer;
    }
   
}