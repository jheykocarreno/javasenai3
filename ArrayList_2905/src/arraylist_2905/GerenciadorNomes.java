package arraylist_2905;

public class GerenciadorNomes {
    
    String[] nomes = new String [5];
    
    public void inserirUsuario(int posicao, String nome){
        
        posicao = posicao - 1;

        if (posicao >= 0 && posicao < nomes.length){
            nomes[posicao] = nome;
        } else {
            System.out.println("O array é de 5 posicoes.");
        }
    }
    
    public void listarUsuario(){
        
        for(int i = 0; i < nomes.length; i++){
            System.out.print("Usuario: " + (i+1) + " = " + nomes[i]);
        } 
    }
    
    public void atualizarUsuario(int posicao, String novoNome){
        
        if (nomes[posicao] != null){
            nomes[posicao] = novoNome;
        } else {
            System.out.println("Nao foi possivel atualizar");
        }
    }
    
    public void deletarUsuario(int posicao){
        if (nomes[posicao] != null){
            nomes[posicao] = null;
        } else {
            System.out.println("Nao foi possivel deletar");
        }
    }
    
}
