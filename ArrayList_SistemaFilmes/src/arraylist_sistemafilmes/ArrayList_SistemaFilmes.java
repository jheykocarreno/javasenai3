package arraylist_sistemafilmes;

import java.util.Scanner;

public class ArrayList_SistemaFilmes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaFilmes gFilmes = new SistemaFilmes();
        String titulo, diretor, genero;
        int ano;
        int opcaoUsuario;

        do {
            System.out.println("Bem vindo ao sistema de gerencimento de filmes."
                    + "Escolha uma opção abaixo: ");
            System.out.println("[1] - Cadastrar um filme");
            System.out.println("[2] - Listar todos os filmes");
            System.out.println("[3] - Listar um filmes");
            System.out.println("[4] - Atualizar um filme");
            System.out.println("[5] - Deletar um filme");
            System.out.println("[0] - Sair do programa");

            opcaoUsuario = sc.nextInt();
            
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("Informe o nome do filme: ");
                    titulo = sc.nextLine();

                    System.out.println("Informe o nome do diretor: ");
                    diretor = sc.nextLine();

                    System.out.println("Informe o ano do filme: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Informe o genero do filme: ");
                    genero = sc.nextLine();

                    gFilmes.adicionarFilme(titulo, diretor, ano, genero);
                    break;
                    
                case 2:
                    System.out.println("Listagem de filmes: ");
                    gFilmes.listarTodosFilmes();
                    break;
                    
                case 3:
                    System.out.println("Informe o titulo do filme que deseja consultar: ");
                    titulo = sc.nextLine();

                    gFilmes.consultarFilme(titulo);
                    break;
                    
                case 4:
                    gFilmes.listarTodosFilmes();
                    
                    System.out.println("Informe o titulo do filme que você deseja atualizar?");
                    String tituloBuscado = sc.nextLine();
                    
                    System.out.println("Informe o novo diretor do filme: ");
                    diretor = sc.nextLine();
                    
                    System.out.println("Informe o novo ano do filme: ");
                    ano = sc.nextInt();
                    
                    System.out.println("Informe o novo genero do filme");
                    genero = sc.nextLine();
                    
                    gFilmes.atualizarFilme(tituloBuscado, diretor, ano, genero);
                    break;
                    
                case 5:
                    gFilmes.listarTodosFilmes();
                    
                    System.out.println("Qual filme você deseja remover ? : ");
                    titulo = sc.nextLine();
                    
                    gFilmes.removerFilme(titulo);
                    break;
                    
                case 0: 
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                    
                default:
                    throw new AssertionError();
            }

        } while (opcaoUsuario != 0);
    }
    
}
