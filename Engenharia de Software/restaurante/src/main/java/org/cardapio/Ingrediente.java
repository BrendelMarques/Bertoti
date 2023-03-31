package org.cardapio;

public class Ingrediente {
    private String nome;
    private String tipo;

    public Ingrediente(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getNome(){

        return nome;
    }

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public String getTipo(){

        return tipo;
    }
}
