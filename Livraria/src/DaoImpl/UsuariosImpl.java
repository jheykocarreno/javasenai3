package DaoImpl;

import Dao.IUsuariosDao;
import Model.Usuarios;

import java.util.List;

public class UsuariosImpl implements IUsuariosDao {
    @Override
    public List<Usuarios> getAllusers() {
        return List.of();
    }

    @Override
    public void createUser(Usuarios usuarios) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public Usuarios findUser(int id) {
        return null;
    }
}
