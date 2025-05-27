
package ex_oper_cond_2705;

import java.util.Scanner;

public class Ex_Oper_Cond_2705 {

    public static void main(String[] args) {
        
        //Desafio 1 – Verificador de Triângulo
        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Primeiro lado: ");
//        int lado1 = sc.nextInt();
//        System.out.println("Segundo lado: ");
//        int lado2 = sc.nextInt();
//        System.out.println("Terceiro lado: ");
//        int lado3 = sc.nextInt();
//        
//        boolean simExiste = false;
//        
//        //Comprovamos que é possivel esse triangulo
//        if (lado1 < (lado2 + lado3)){
//            if (lado2 < (lado1 + lado3)){
//                if (lado3 < lado1 + lado2){
//                    System.out.println("O TRIANGULO EXISTE.");
//                    simExiste = true;
//                } else {
//                    System.out.println("O triangulo nao existe");
//                }
//            }else {
//                System.out.println("O triangulo não existe");
//            }
//        } else {
//            System.out.println("O triangulo não existe");
//        }
//        
//        //Comprovamos que tipo de triangulo é
//        if (simExiste){
//            if ((lado1 == lado2) && (lado1 == lado3)){
//                System.out.println("O Triangulo é EQUILATERO");
//            } else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
//                System.out.println("O Triangulo é ESCALENO");
//            } else {
//                System.out.println("O TRIANGULO é ISOSCELES");
//            }
//        }
        
        //Desafio 2 – Calculadora de IMC
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Peso (Kg): ");
        double peso = sc.nextDouble();
        
        System.out.println("Altura (m): ");
        double altura = sc.nextDouble();
        
        //Calculamos sendo o IMC = peso / (altura * altura)
        double imc = peso / (altura * altura);
        
        if (imc < 18.5){
            System.out.println("Abaixo de Peso");
        } else if ((imc >= 18.5) && (imc < 25)){
            System.out.println("Peso Normal");
        } else if ((imc >= 25) && (imc < 30)) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
