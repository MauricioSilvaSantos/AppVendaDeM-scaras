package com.example.appvendademscaras.model;

public class ModelPostagem {
    private String nome;
    private String postagem;
    private int image;

    public ModelPostagem() {

    }

    public ModelPostagem(String nome, String postagem, int image) {
        this.nome = nome;
        this.postagem = postagem;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
