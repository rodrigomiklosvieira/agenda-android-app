package br.com.etecia.agenda_app.model;

import java.util.Calendar;

public class Pessoa {

    private long id;
    private String nome;
    private Calendar dataNascimento;
    private Contato contato;
    private Endereco endereco;

    public Contato getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

//    public Pessoa(long id, String nome, Calendar dataNascimento, Contato contato, Endereco endereco) {
//        this.id = id;
//        this.nome = nome;
//        this.dataNascimento = dataNascimento;
//        this.contato = contato;
//        this.endereco = endereco;
//    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
