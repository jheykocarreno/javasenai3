package arraylist_gerlivros;

import java.util.ArrayList;

public class GerenciadorLivros {
    
    ArrayList<Livros> livraria = new ArrayList<Livros>();
    
    public void insertLivro (Livros livro){
        livraria.add(livro);
    }
    
    public void listLivro(){
        if (livraria.isEmpty()){
            System.out.println("Nao tem livros cadastrados");
        } else {
            for (Livros livro : livraria){
                System.out.println(livro);
            }
        }
    }
    
    public void updateLivro(Livros livro){
        
    }
    
    public Livros findLivro(String nome){
        boolean existe = false;

        for (Livros livro : livraria) {
            if (livro.nomeLiv.equalsIgnoreCase(nome)) {
                System.out.println(livro);
                existe = true;
            }
        }
        if (existe){
            return livro;
        } else {
            return livro;
        }
    }
}
