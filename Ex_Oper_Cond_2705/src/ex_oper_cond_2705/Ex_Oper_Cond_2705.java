
package ex_oper_cond_2705;

import java.util.Random;
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
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Peso (Kg): ");
//        double peso = sc.nextDouble();
//        
//        System.out.println("Altura (m): ");
//        double altura = sc.nextDouble();
//        
//        //Calculamos sendo o IMC = peso / (altura * altura)
//        double imc = peso / (altura * altura);
//        
//        if (imc < 18.5){
//            System.out.println("Abaixo de Peso");
//        } else if ((imc >= 18.5) && (imc < 25)){
//            System.out.println("Peso Normal");
//        } else if ((imc >= 25) && (imc < 30)) {
//            System.out.println("Sobrepeso");
//        } else {
//            System.out.println("Obesidade");
//        }

        //Desafio 3 – Número Mágico
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Bota um numero do 1 ao 10");
//        int numero = sc.nextInt();
//        
//        if ((numero < 1) || (numero > 10)){
//            System.out.println("Somente pode ser do 1 ao 10");
//        } else {      
//            int gerador = (int)(Math. random() * 10);
//            
//            System.out.println(gerador);
//            if (numero == gerador){
//                System.out.println("Parabems, acertou");
//            } else {
//                System.out.println("Errouuuuuuu");
//            }
//        }
        
        //Desafio 4 – Classificação de Eleitor
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual e tua idade: ");
        
        int idade = sc.nextInt();
        
        if ((idade >= 18) && (idade <= 70)){
            System.out.println("Voto obrigatório");
        } else if (idade < 16){
            System.out.println("Não vota");
        } else {
            System.out.println("Voto facultativo");
        }
    }
}
