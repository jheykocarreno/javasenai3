package estruturasrepeticao;

import java.util.Calendar;
import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {
        
//        String emailUsuario = "admin";
//        String senhaUsuario = "admin";
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Informa o usuario: ");
//        String emailEnt = sc.nextLine();
//        
//        System.out.println("Informa a senha: ");
//        String senhaEnt = sc.nextLine();
//                
//        while ((!emailUsuario.equals(emailEnt)) || (!senhaUsuario.equals(senhaEnt))) {
//            System.out.println("Incorreto, tenta novamente");
//            
//            System.out.println("Informa o usuario: ");
//            emailEnt = sc.nextLine();
//        
//            System.out.println("Informa a senha: ");
//            senhaEnt = sc.nextLine();
//        }
//        
//        System.out.println("Login bem sucedido");

        Calendar calendario = Calendar.getInstance();
        int numeroDeLaSemana = calendario.get(Calendar.WEEK_OF_YEAR);
        System.out.println("El número de la semana actual es: " + numeroDeLaSemana);

    }
}
