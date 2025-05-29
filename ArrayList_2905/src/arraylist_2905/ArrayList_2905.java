package arraylist_2905;

import java.util.Scanner;

public class ArrayList_2905 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorNomes gNomes = new GerenciadorNomes();
        
        System.out.println("Bem-vindo ao sistema de usuarios");
        int opcao;
        
        do {
            System.out.println("[1] - Cadastro de usuario");
            System.out.println("[2] - Listagem de usuario");
            System.out.println("[3] - Atualizar usuario");
            System.out.println("[4] - Deletar usuario");
            System.out.println("[5] - Sair do sistema");
            System.out.print("Selecionar uma opcao: ");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            int posicao;
            String nome;
            
            switch (opcao){
                case 1:
                    System.out.println("Inserir posicao: ");
                    posicao = sc.nextInt();
                    
                    sc.nextLine();
                    System.out.println("Inserir nome: ");
                    nome = sc.nextLine();
                    
                    gNomes.inserirUsuario(posicao, nome);
                    break;
                
                case 2:
                    gNomes.listarUsuario();
                    break;
                    
                case 3:
                    gNomes.listarUsuario();
                    
                    System.out.println("Inserir posicao: ");
                    posicao = sc.nextInt();
                    System.out.println("Inserir o novo nome: ");
                    nome = sc.nextLine();
                    
                    gNomes.inserirUsuario(posicao, nome);
                    break;
                
                case 4:
                    gNomes.listarUsuario();
                    
                    System.out.println("Inserir posicao: ");
                    posicao = sc.nextInt();
                    
                    gNomes.deletarUsuario(posicao);
                    break;
                
                default:
                    throw new AssertionError();
                        
            }
        } while (opcao != 5);
        
        sc.close();
    }
    
}
