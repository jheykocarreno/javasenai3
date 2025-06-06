package arraylist_sistemafilmes;

public class Filme {
    
    String titulo, diretor, genero;
    int anoLancamento;
    
    public Filme(){}
    
    public Filme (String titulo, String diretor, int anoLancamento, String genero){
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", diretor=" + diretor + ", genero=" + genero + ", anoLancamento=" + anoLancamento + '}';
    }

}
