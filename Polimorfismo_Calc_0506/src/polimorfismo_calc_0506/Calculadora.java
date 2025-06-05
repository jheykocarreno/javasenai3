package polimorfismo_calc_0506;

public class Calculadora {
    //Metodo para somar dois enteiros
    public int somar (int a, int b){
        return a + b;
    }
    
    //overload - somar tres enteiros
    public int somar (int a, int b, int c){
        return a + b + c;
    }
    
    //overload - somar dois numeros double
    public double somar (double a, double b){
        return a + b;
    }
    
    //overload - somar um enteiro e um double
    public double somar (int a, double b){
        return a + b;
    }
}
