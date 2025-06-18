package DaoImpl;

import Dao.ILivrosDao;
import Model.Livros;
import Database.MysqlConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivrosDaoImpl implements ILivrosDao {
    private final Connection conn;

    public LivrosDaoImpl() {
        try {
            conn = MysqlConnection.conectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Livros> getAllBooks() {
        List<Livros> livros = new ArrayList<>();

        try{
            //Cria o estado para executar a consulta SQL
            Statement stmt = conn.createStatement();

            //Executa a consulta e armazena o resultado em um ResultSet
            //ResultSet representa uma tabela temporaria em memoria, com os dados recuperados da consuta
            ResultSet resultSet = stmt.executeQuery("select * from livros");

            while (resultSet.next()){
                //Criar objeto Livros
                Livros livro = new Livros();

                livro.setIdLivro(resultSet.getInt("idLivro"));
                livro.setNomeLiv(resultSet.getString("nomeLiv"));
                livro.setAutorLiv(resultSet.getString("autorLiv"));
                livro.setEditoraLiv(resultSet.getString("editoraLiv"));

                livros.add(livro);
            }

            if (livros.isEmpty()){
                System.out.println("Nenhum livro esta cadastrado no sistema");
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

        return livros;
    }

    @Override
    public void CreateBook(Livros livro) {

    }

    @Override
    public void DeleteBook(int id) {

    }

    @Override
    public Livros findBook(int id) {
        //SQL param
        String sql = "SELECT * FROM livros WHERE idLivro = ?"; //parametro da query
        
        try (PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setInt(1, id); //define o valor do parametro na query
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()){
                Livros livro = new Livros();

                livro.setIdLivro(resultSet.getInt("idLivro"));
                livro.setNomeLiv(resultSet.getString("nomeLiv"));
                livro.setAutorLiv(resultSet.getString("autorLiv"));
                livro.setEditoraLiv(resultSet.getString("editoralLiv"));

                return livro;
            } else {
                System.out.println("Nenhum usuario encontrado");
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar livro por ID. " + e.getMessage())
        }

        return null;
    }
}
