package operLog_Condicionais;

public class OperLog_Condicionais {

//    public static void main(String[] args) {


//                e   ou  se..entao..  se somente se   não     
//        p   q   ^    v     -->        <->         !=
//        V   V   V    V      V          V           F
//        V   F   F    V      F          F           F
//        F   V   F    V      V          F           V           
//        F   F   F    F      V          V           V

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
//}
