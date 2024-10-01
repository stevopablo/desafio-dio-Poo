package br.com.dio.desafio.dominio;

public abstract class Conteudo {
   protected final static double XP_PADRAO = 10;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String titulo;
    private String descricao;

    public abstract double calcularXp();



}
