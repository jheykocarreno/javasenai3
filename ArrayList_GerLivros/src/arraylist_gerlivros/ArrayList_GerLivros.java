package arraylist_gerlivros;

import java.security.Guard;
import java.util.Scanner;

public class ArrayList_GerLivros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Livros livro = new Livros();
        String nome, autor, descricao;
        GerenciadorLivros gLivros = new GerenciadorLivros();
        
        int opcao;
        
        do {
            System.out.println("\n--- Sistema de Livraria ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Atualizar livro");
            System.out.println("3. Listar todos os livros");
            System.out.println("4. Deletar um livro");
            System.out.println("5. Buscar livro específico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do livro: ");
                    nome = sc.nextLine();
                    livro.nomeLiv = nome;
                    System.out.println("Autor do livro: ");
                    autor = sc.next();
                    livro.autorLiv = autor;
                    System.out.println("Descricao livro: ");
                    descricao = sc.nextLine();
                    livro.descLiv = descricao;
                    
                    sc.nextLine();
                    
                    gLivros.insertLivro(livro);
                    break;
                    
                case 2:
                    System.out.print("Digite o nome do livro a ser atualizado: ");
                    nome = sc.nextLine();
                    livro.nomeLiv = nome;
                    
                    boolean existe = gLivros.findLivro(nome);
                    
                    if (existe){
                        System.out.print("Novo nome: ");
                        livro.nomeLiv = sc.nextLine();
                        System.out.print("Novo autor: ");
                        livro.autorLiv = sc.nextLine();
                        System.out.print("Nova descrição: ");
                        livro.descLiv = sc.nextLine();
                        
                        gLivros.updateLivro(livro);
                    }
                    break;
                    
                case 3:
                    gLivros.listLivro();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    
}
