package org.cardapio;

public class Pizza {

    private String nome;
    private String ingrediente;

    public Pizza(String nome, String ingrediente) {
        this.nome = nome;
        this.ingrediente = ingrediente;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIngrediente(){
        return ingrediente;
    }
    
    public void setIngrediente(String ingrediente){
        this.ingrediente = ingrediente;
    }
}
