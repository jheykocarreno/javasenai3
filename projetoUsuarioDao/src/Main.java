import DaoImpl.UsuarioDaoImpl;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        //Listar todos os usuários
        UsuarioDaoImpl userDao = new UsuarioDaoImpl();

        for (Usuario allUser : userDao.getAllUsers()) {
            System.out.println("IdUsuario: " + allUser.getIdUsuario() + " | nomeUsuario: "
                    + allUser.getNomeUsuario() + " | idadeUsuario: " + allUser.getIdadeUsuario()
            );
        }


        //Listar usuário por id
        Usuario usuarioBuscado = userDao.getUserById(3);

        if (usuarioBuscado != null) {
            System.out.println("Usuário encontrado!");
            System.out.println(usuarioBuscado);
        } else {
            System.out.println("Nenhum usuário encontrado! ");
        }
    }
}