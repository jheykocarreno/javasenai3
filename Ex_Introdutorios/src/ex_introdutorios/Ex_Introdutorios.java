
package ex_introdutorios;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Ex_Introdutorios {

    public static void main(String[] args) {
        //1. Escreva um programa que peça o nome do usuário e exiba uma saudação.
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingresse seu nomer");
//        String nome1 = sc.nextLine();
//        
//        System.out.println("Bem-vindo " + nome1);
        
        //2. Faça um programa que leia dois números inteiros e exiba a soma entre eles.
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingresse o primeiro numero: ");
//        int num1 = sc.nextInt();
//        System.out.println("Ingresse o segundo numero: ");
//        int num2 = sc.nextInt();
//        
//        System.out.println("A soma dos numeros é: " + (num1 + num2));
        
        //3. Leia duas notas e exiba a média.
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Ingresse a primeira nota: ");
//        double n1 = sc.nextDouble();
//        System.out.println("Ingresse a segunda nota: ");
//        double n2 = sc.nextDouble();
//
//        System.out.println("A soma dos numeros é: " + ((n1 + n2)/2));
        
        //4. Declare variáveis dos tipos int, double, boolean e char. Atribua valores e imprima todos.
//        int varInt;
//        double varDouble;
//        boolean varBoolean;
//        char varChar;
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresse um numero");
//        varInt = sc.nextInt();
//        System.out.println("Ingresse um tipo double");
//        varDouble = sc.nextDouble();
//        System.out.println("Ingresse um Boolean: True ou False");
//        varBoolean = sc.nextBoolean();
//        System.out.println("Ingresse um char/caracter");
//        varChar = sc.next().charAt(0);
//        
//        System.out.println(varInt);
//        System.out.println(varDouble);
//        System.out.println(varBoolean);
//        System.out.println(varChar);

        //5. DESAFIO: Leia o nome, idade e altura de uma pessoa e exiba no formato:
        //"Nome: Ana | Idade: 20 anos | Altura: 1.65 m
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Altura: " + altura);
    }
}
