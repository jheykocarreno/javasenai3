/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operLog_Condicionais;

/**
 *
 * @author fic
 */
public class Condicional {
    
     public static void main(String[] args) {
         
    String semaforo = "VERMELHO";
    
    if ("verde".equals(semaforo.toLowerCase())){
        System.out.println("Pode passar");
    } else if ("amarelo".equals(semaforo.toLowerCase())){
        System.out.println("Tenha cuidado");
    } else if ("vermelho".equals(semaforo.toLowerCase())){
        System.out.println("Parar e esperar");
    } else {
        System.out.println("Nenhuma condicao foi atendida");
    }
}
}
