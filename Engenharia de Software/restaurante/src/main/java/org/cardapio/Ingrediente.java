package org.cardapio;

public class Ingrediente {
    private String nome;

    public Ingrediente(String nome, String tipo){
        this.nome = nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getNome(){

        return nome;
    }
}
