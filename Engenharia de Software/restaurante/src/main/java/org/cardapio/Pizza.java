package org.cardapio;

import java.util.List;

public class Pizza {

    private String nome;
    private List<Ingrediente> ingrediente;

    public Pizza(String nome, List<Ingrediente> ingrediente) {
        this.nome = nome;
        this.ingrediente = ingrediente;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Ingrediente> getIngrediente(){
        return ingrediente;
    }
}
