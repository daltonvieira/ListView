package com.example.dlei.listview;

public class Escola {

    private String nome;
    private int imagen;
    private String endereco;

    public Escola (String nome , String endereco, int imagen){
        this.nome = nome;
        this.endereco = endereco;
        this.imagen = imagen;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
