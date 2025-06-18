package Model;

import java.util.List;

public class Livros {
    //atributos
    //construtores
    //getters-setters

    int idLivro;
    String nomeLiv;
    String autorLiv;
    String editoraLiv;

    //Construtor
    public Livros(){};

    public int getIdLivro() { return idLivro; }

    public void setIdLivro(int IdLivro){ this.idLivro = idLivro; }

    public String getNomeLiv() { return nomeLiv; }

    public void setNomeLiv (String nomeLiv) { this.nomeLiv = nomeLiv; }

    public String getAutorLiv() { return autorLiv; }

    public void setAutorLiv(String autorLiv) { this.autorLiv = nomeLiv; }

    public String getEditoraLiv() { return editoraLiv; };

    public void setEditoraLiv(String editoraLiv) { this.editoraLiv = editoraLiv; }

    @Override
    public String toString() {
        return "Livros{" +
                "idLivro=" + idLivro +
                ", nomeLiv='" + nomeLiv + '\'' +
                ", autorLiv='" + autorLiv + '\'' +
                ", editoraLiv='" + editoraLiv + '\'' +
                '}';
    }
}
