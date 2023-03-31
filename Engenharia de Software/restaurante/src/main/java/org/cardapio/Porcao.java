package org.cardapio;

import java.util.List;

public class Porcao {

    private String nome;
    private List<Ingrediente> ingrediente;

    public Porcao(String nome, List<Ingrediente> ingrediente) {
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
