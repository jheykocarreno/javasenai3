package polimorfismo_calc_0506;

public class Polimorfismo_Calc_0506 {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(5, 6, 7));
        System.out.println(calc.somar(2.1, 5.3));
        System.out.println(calc.somar(8, 9.5));
    }
    
}
