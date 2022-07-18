package Módulo03.Exercício03;

public class Prato {

   String nomePrato;
   String ingredientes;

    public Prato(String nomePrato, String ingredientes) {
        this.nomePrato = nomePrato;
        this.ingredientes = ingredientes;
    }

    public String getNomePrato(){
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
