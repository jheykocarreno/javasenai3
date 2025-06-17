package heranca;

//Crie uma clase chamada funcionario
//Crie atributos nome e salario
//deois crie:
//  gerente --> herda de funcionario e tem atributo adicional setor
//  vendedor --> herda de funcionario e tem atributo adicional comissao

public class Funcionario{
    protected String nomeFun;
    protected double salarioFun;
    protected double bonusFun;
        
    public Funcionario (String nomeFun, double salarioFun){
        this.nomeFun = nomeFun;
        this.salarioFun = salarioFun;
    }
        
    //Metodo para visualizar dados
    public String exibirDados(){
        return "Nome: " + nomeFun + ", Salario: " + salarioFun;
    }
    
    public String bonusFuncionario(){
        bonusFun = this.salarioFun * 0.05;
        return "Nome: " + nomeFun + ", Salario: " + salarioFun + ", Bonus: " + bonusFun;
    }

}
