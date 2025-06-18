package Model;

public class Usuarios {
    //atributos
    int idUsuario;
    String nomeUsu;
    String enderecoUsu;
    String telefoneUsu;
    int idLivro;

    //construtor
    public Usuarios(){};

    //acessores (getters - setters)
    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNomeUsu() { return nomeUsu; }

    public void setNomeUsu(String nomeUsu) { this.nomeUsu = nomeUsu; }

    public String getEnderecoUsu() { return enderecoUsu; }

    public void setEnderecoUsu(String enderecoUsu) { this.enderecoUsu = enderecoUsu; }

    public String getTelefoneUsu() { return telefoneUsu; }

    public void setTelefoneUsu(String telefoneUsu) { this.telefoneUsu = telefoneUsu; }

    public int getIdLivro() { return idLivro; }

    public void setIdLivro(int idLivro) { this.idLivro = idLivro; }

    @Override
    public String toString() {
        return "Usuarios{" +
                "idUsuario=" + idUsuario +
                ", nomeUsu='" + nomeUsu + '\'' +
                ", enderecoUsu='" + enderecoUsu + '\'' +
                ", telefoneUsu='" + telefoneUsu + '\'' +
                ", idLivro=" + idLivro +
                '}';
    }
}
