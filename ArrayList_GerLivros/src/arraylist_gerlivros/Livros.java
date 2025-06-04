package arraylist_gerlivros;

public class Livros {
    String nomeLiv, autorLiv, descLiv;
    
    public Livros(){}
    
    public Livros(String nomeLiv, String autorLiv, String descLiv){
        this.nomeLiv = nomeLiv;
        this.autorLiv = autorLiv;
        this.descLiv = descLiv;
    }

    public String getNomeLiv() {
        return nomeLiv;
    }

    public String getAutorLiv() {
        return autorLiv;
    }

    public String getDescLiv() {
        return descLiv;
    }

    public void setNomeLiv(String nomeLiv) {
        this.nomeLiv = nomeLiv;
    }

    public void setAutorLiv(String autorLiv) {
        this.autorLiv = autorLiv;
    }

    public void setDescLiv(String descLiv) {
        this.descLiv = descLiv;
    }

    @Override
    public String toString() {
        return "Livros{" + "nomeLiv=" + nomeLiv + ", autorLiv=" + autorLiv + ", descLiv=" + descLiv + '}';
    }
    
}
