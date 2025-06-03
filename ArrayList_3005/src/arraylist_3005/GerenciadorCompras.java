package arraylist_3005;

import java.util.ArrayList;

public class GerenciadorCompras {
    ArrayList<String> produtos = new ArrayList<String>();
    
    public void insertProduct(String produto){
        
        if (produtos.size() < 10){
             produtos.add(produto);
        } else {
            System.out.println("Maximo 10 produtos.");
        }  
    }
    
    public void listProduct(){
        
        for (int i = 0; i < produtos.size(); i++){
            System.out.println("Produto " + (i+1) + ": " + produtos.get(i));
        }
    }
    
    public void updateProduct(String produtoOld, String produtoNew){
        
        boolean existe = produtos.contains(produtoOld);
                
        if (existe){
            int indice = produtos.indexOf(produtoOld);
            produtos.set(indice, produtoNew);
        } else {
            System.out.println("Nao existe esse Produto");
        }
    }
    
    public void deleteProduct(String produto){
        
        boolean existe = produtos.contains(produto);
                
        if (existe){
            int indice = produtos.indexOf(produto);
            produtos.remove(indice);
        } else {
            System.out.println("Delete nao executado, produto nao existe");
        }
    }
}
