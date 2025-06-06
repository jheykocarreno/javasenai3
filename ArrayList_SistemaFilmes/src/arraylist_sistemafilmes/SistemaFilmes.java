package arraylist_sistemafilmes;

import java.util.ArrayList;

public class SistemaFilmes {
    
    ArrayList<Filme> filmes = new ArrayList<>();
    
    public void adicionarFilme (String titulo, String diretor, int ano, String genero){
        filmes.add(new Filme(titulo, diretor, ano, genero));
        
        System.out.println("Filme cadastrado com sucesso");
    }
    
    public void removerFilme (String tituloDeletado){
        for (Filme filme : filmes){
            if (filme.getTitulo().equalsIgnoreCase(tituloDeletado)) {
                filmes.remove(filme);
                System.out.println("Filme deletado");
                return;
            }
        }
        System.out.println("Filme nao encontrado");
    }
    
    public void listarTodosFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado");
        } else {
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        } 
    }
    
    public void consultarFilme(String tituloProcurado) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(tituloProcurado)) {
                System.out.println(filme);
                return;
            }
        }
        System.out.println("Nenhum filme com o nome: " + tituloProcurado + " foi encontrado");
    }
    
    public void atualizarFilme(String tituloBuscado, String diretor, int ano, String genero) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                filme.setDiretor(diretor);
                filme.setAnoLancamento(ano);
                filme.setGenero(genero);

                System.out.println("Livro foi atualizado com sucesso! ");
                return;
            }
        }
        System.out.println("Nenhum filme foi encontrado com o titulo: " + tituloBuscado);
    }
    
}
