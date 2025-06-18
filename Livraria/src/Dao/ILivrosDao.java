package Dao;

import Model.Livros;

import java.util.List;

public interface ILivrosDao {

    //Metodo para listar todos os livros
    public List<Livros> getAllBooks();

    //Metodo para criar livro
    public void CreateBook(Livros livro);

    //Metodo para deletar livro
    public void DeleteBook(int id);

    //Metodo para buscar livro
    public Livros findBook(int id);
}
