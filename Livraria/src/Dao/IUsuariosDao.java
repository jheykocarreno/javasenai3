package Dao;

import Model.Usuarios;

import java.util.List;

public interface IUsuariosDao {

    //Método de listar todos os usuários
    public List<Usuarios> getAllusers();

    //Metodo de criar usuario
    public void createUser(Usuarios usuarios);

    //Metodo de deletar usuario
    public void deleteUser(int id);

    //Metodo de buscar usuario
    public Usuarios findUser(int id);
}
