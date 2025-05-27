/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.time.InstantSource;
import java.util.Scanner;

/**
 *
 * @author fic
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    System.out.println("Hello World");
        System.out.println("Jheyko");
        System.out.println("A soma e " + 10 + 10);
        System.out.println("A soma e " + (10+10));
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        
        int idade = 22;
        String sexo = "M";
        String nome = "Mimimi";
        boolean estudante = false;
        
        System.out.println(idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Nome: " + nome);
        System.out.println("Estudante " + estudante);
    */
    
        Scanner sc = new Scanner(System.in);
    /*    
        System.out.println("Boa tarde, usuario informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Seja bem vindo " + nome);
    */  
    /*  
        System.out.println("Ingresse o primeiro numero: ");
        int numA = sc.nextInt();
        System.out.println("Ingresse o segundo numero: ");
        int numB = sc.nextInt();
        
        int resultado = numA + numB;
        
        System.out.println("A soma dos 2 numeros é: " + resultado);
    */  
        
        System.out.println("Ingresse o primeiro numero: ");
        double numA = sc.nextDouble();
        System.out.println("Ingresse o segundo numero: ");
        double numB = sc.nextDouble();
        System.out.println("Ingresse o segundo numero: ");
        double numC = sc.nextDouble();
        
        //PEMDAS (Parentesis - Exponenciacion - Multiplicacion - Division + Adicion + Substraccion)
        double resultado = (numA + numB + numC) / 3;
        
        System.out.println("A media dos 3 numeros é: " + resultado);
    }
}
