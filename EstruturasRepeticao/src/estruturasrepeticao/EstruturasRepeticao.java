package estruturasrepeticao;

import java.util.Calendar;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        
        //Desafio 1: Soma de Números Positivos
//        Scanner sc = new Scanner(System.in);
//        int num = 0, soma = 0;
//        //Desafio 1: Soma de Números Positivos
//        while (num >= 0){
//            soma = soma + num;
//            System.out.println("Ingressa um numero:");
//            num = sc.nextInt();
//        } 
//        
//        System.out.println("A soma dos numeros: " + soma);
        
        //Desafio 2: Verificação de Senha
//        String usuario = "admin";
//        String senha = "senha";
//        String usuEnt, senEnt;
//        
//        int contador = 3;
//        
//        Scanner sc = new Scanner(System.in);
//        
//        do{
//            System.out.print("Informar usuario: ");
//            usuEnt = sc.nextLine();
//            System.out.print("Informar senha: ");
//            senEnt = sc.nextLine();
//            
//            if ((usuEnt.equals(usuario) && senEnt.equals(senEnt))){
//                System.out.println("Login correto");
//                contador = 0;
//            } else {
//                contador--;
//                System.out.println("Incorrecto. Tem " + contador + " intentos");
//                if (contador == 0){
//                    System.out.println("Volte mais tarde!");
//                }
//            } 
//        } while (contador > 0);
        
        //Desafio 3: Números Pares e Ímpares
//        Scanner sc = new Scanner(System.in);
//        int resto;
//        
//        System.out.print("Informar numero: ");
//        int num = sc.nextInt();
//        
//        for(int i = 0; i < num; i++){
//            resto = i % 2;
//            
//            if (resto == 0){
//                System.out.println("Num Par: " + i);
//            }
//        }
        
        //Desafio 4: Número Primo
        Scanner sc = new Scanner(System.in);
        int resto;
        
        System.out.print("Informar numero: ");
        int num = sc.nextInt();
        boolean ePrimo = true;
        
        for(int i = 2; i < num; i++){
            resto = num % i ;
            
            if (resto == 0){
                ePrimo = false;
                i = num;
            }
        }
        
        if (ePrimo){
            System.out.println("O numero " + num + " e primo");
        } else {
            System.out.println("O numero " + num + " nao e primo");
        }
        
    }
}
