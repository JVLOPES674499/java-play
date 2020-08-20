package com.company.pessoas;

public class Pessoa implements IPessoa{
     String nome;
     String genero;

    @Override
    public void fala(){
        System.out.println("Pessoa falando...");
    }

    @Override
    public void anda() {
        System.out.println("Pessoa andando...");
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

}



