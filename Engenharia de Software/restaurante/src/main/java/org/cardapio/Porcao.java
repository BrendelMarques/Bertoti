package org.cardapio;

public class Porcao {

    private String nome;
    private String ingrediente;

    public Porcao(String nome, String ingrediente) {
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
}
