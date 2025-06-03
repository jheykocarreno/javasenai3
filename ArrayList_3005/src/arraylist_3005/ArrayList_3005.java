package arraylist_3005;

import java.util.Scanner;

public class ArrayList_3005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorCompras gProduto = new GerenciadorCompras();
        
        System.out.println("Bem-vindo ao sistema de Produtos");
        
        int opcao;
        
        do {
            System.out.println("[1] - Cadastro de produto");
            System.out.println("[2] - Listagem de produtos");
            System.out.println("[3] - Atualizar produto");
            System.out.println("[4] - Deletar produto");
            System.out.println("[5] - Sair do sistema");
            System.out.print("Selecionar uma opcao: ");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            String produto, produtoOld;
            
            switch (opcao){
                case 1:
                    System.out.println("Inserir produto: ");
                    produto = sc.nextLine();
                    
                    sc.nextLine();
                    
                    gProduto.insertProduct(produto);
                    break;
                
                case 2:
                    gProduto.listProduct();
                    break;
                    
                case 3:
                    gProduto.listProduct();
                    
                    System.out.println("Inserir produto a modificar: ");
                    produtoOld = sc.nextLine();
                    
                    System.out.println("Inserir o novo produto: ");
                    produto = sc.nextLine();
                    
                    gProduto.updateProduct(produtoOld, produto);
                    break;
                
                case 4:
                    gProduto.listProduct();
                    
                    System.out.println("Inserir produto a deletar: ");
                    produto = sc.nextLine();
                    
                    gProduto.deleteProduct(produto);
                    break;
                
                default:
                    throw new AssertionError();
                        
            }
        } while (opcao != 5);
        
        sc.close();
    }
    
}
