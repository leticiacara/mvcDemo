package br.fatecrl.mvcdemo.models;


public class Flor {
    private Integer id;
    private String nome;
    private Integer qntd;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQntd() {
        return qntd;
    }

    public Flor(Integer id, String nome, Integer qntd) {
        this.id = id;
        this.nome = nome;
        this.qntd = qntd;
    }
}
